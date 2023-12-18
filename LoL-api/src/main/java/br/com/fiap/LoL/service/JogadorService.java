package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.JogadorDTO;
import br.com.fiap.LoL.dto.KdaDTO;
import br.com.fiap.LoL.model.Jogador;
import br.com.fiap.LoL.model.Kda;
import br.com.fiap.LoL.repository.JogadorRepository;

import br.com.fiap.LoL.repository.KdaRepository;
import br.com.fiap.LoL.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private KdaRepository kdaRepository;

    @Autowired
    private PartidaRepository partidaRepository;

    public Page<Jogador> listAll(Pageable pageRequest) {
        return jogadorRepository.findAll(pageRequest);
    }

    public Jogador findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Jogador create(JogadorDTO newData) {
        Jogador entity = convertToEntity(newData);
        return jogadorRepository.save(entity);
    }

    @Transactional
    public Jogador update(Long id, JogadorDTO updatedData) {
        Jogador entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return jogadorRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Jogador entity = findEntityById(id);
        jogadorRepository.delete(entity);
    }

    private Jogador findEntityById(Long id) {
        return jogadorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Jogador não encontrado por ID: " + id));
    }

    private Jogador convertToEntity(JogadorDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("JogadorDTO não pode ser nulo.");
        }

        Jogador entity = dto.getId() != null ? findEntityById(dto.getId()) : new Jogador();
        updateEntityWithDTO(entity, dto);

        return entity;
    }

    private void updateEntityWithDTO(Jogador entity, JogadorDTO dto) {
        entity.setNome(dto.getNome());
        entity.setFuncao(dto.getFuncao());

        if (dto.getIdsEstatisticasPartidas() != null) {
            final Jogador finalEntity = entity;
            Set<Kda> estatisticas = dto.getIdsEstatisticasPartidas().stream()
                    .map(id -> {
                        try {
                            KdaDTO kdaDto = buscarKdaDTO(id);
                            return convertKdaDTOToEntity(kdaDto, finalEntity);
                        } catch (Exception e) {
                            throw new RuntimeException("Erro ao converter ID de Kda para entidade", e);
                        }
                    })
                    .collect(Collectors.toSet());
            entity.setEstatisticasPartidas(estatisticas);
        }
    }

    private KdaDTO buscarKdaDTO(Long id) {
        Kda kda = kdaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "KDA não encontrado por ID: " + id));

        KdaDTO kdaDto = new KdaDTO();
        kdaDto.setId(kda.getId());
        kdaDto.setIdPartida(kda.getPartida() != null ? kda.getPartida().getId() : null);
        kdaDto.setIdJogador(kda.getJogador() != null ? kda.getJogador().getId() : null);
        kdaDto.setAbates(kda.getAbates());
        kdaDto.setMortes(kda.getMortes());
        kdaDto.setAssistencias(kda.getAssistencias());

        return kdaDto;
    }

    private Kda convertKdaDTOToEntity(KdaDTO dto, Jogador jogador) {
        Kda kda = dto.getId() != null ? kdaRepository.findById(dto.getId()).orElse(new Kda()) : new Kda();
        kda.setPartida(partidaRepository.findById(dto.getIdPartida()).orElseThrow(() -> new IllegalArgumentException("Partida não encontrada.")));
        kda.setJogador(jogador);
        kda.setAbates(dto.getAbates());
        kda.setMortes(dto.getMortes());
        kda.setAssistencias(dto.getAssistencias());
        return kda;
    }
}
