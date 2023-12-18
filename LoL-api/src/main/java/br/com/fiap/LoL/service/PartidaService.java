package br.com.fiap.LoL.service;

import br.com.fiap.LoL.dto.KdaDTO;
import br.com.fiap.LoL.dto.PartidaDTO;
import br.com.fiap.LoL.model.Item;
import br.com.fiap.LoL.model.Kda;
import br.com.fiap.LoL.model.Partida;
import br.com.fiap.LoL.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    @Autowired
    private KdaRepository kdaRepository;

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private CampeonatoRepository campeonatoRepository;

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private ItemService itemRepository;

    @Autowired
    private DragaoRepository dragaoRepository;

    @Autowired
    private EstruturaRepository estruturaRepository;

    @Autowired
    private ChampionRepository championRepository;

    public Page<Partida> listAll(Pageable pageRequest) {
        return partidaRepository.findAll(pageRequest);
    }

    public Partida findById(Long id) {
        return findEntityById(id);
    }

    @Transactional
    public Partida create(PartidaDTO newData) {
        Partida entity = convertToEntity(newData);
        return partidaRepository.save(entity);
    }

    @Transactional
    public Partida update(Long id, PartidaDTO updatedData) {
        Partida entity = findEntityById(id);
        updateEntityWithDTO(entity, updatedData);
        return partidaRepository.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        Partida entity = findEntityById(id);
        partidaRepository.delete(entity);
    }

    private Partida findEntityById(Long id) {
        return partidaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Partida não encontrada por ID: " + id));
    }

    private Partida convertToEntity(PartidaDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("PartidaDTO não pode ser nulo.");
        }
        Partida entity = dto.getId() != null ? findEntityById(dto.getId()) : new Partida();
        updateEntityWithDTO(entity, dto);
        return entity;
    }

    private void updateEntityWithDTO(Partida entity, PartidaDTO dto) {
        entity.setData(dto.getData());
        entity.setCampeonato(campeonatoRepository.findById(dto.getIdCampeonato()).orElseThrow(() -> new IllegalArgumentException("Campeonato não encontrado.")));
        entity.setTime(timeRepository.findById(dto.getIdTime()).orElseThrow(() -> new IllegalArgumentException("Time não encontrado.")));
        Optional<Item> itemOptional = Optional.ofNullable(itemRepository.findById(dto.getIdItem()));
        if (!itemOptional.isPresent()) {
            throw new IllegalArgumentException("Item não encontrado.");
        }
        entity.setItem(itemOptional.get());
        entity.setDragao(dragaoRepository.findById(dto.getIdDragao()).orElseThrow(() -> new IllegalArgumentException("Dragão não encontrado.")));
        entity.setEstrutura(estruturaRepository.findById(dto.getIdEstrutura()).orElseThrow(() -> new IllegalArgumentException("Estrutura não encontrada.")));
        entity.setChampion(championRepository.findById(dto.getIdChampion()).orElseThrow(() -> new IllegalArgumentException("Champion não encontrado.")));
        entity.setArauto(dto.getArauto());
        entity.setBaron(dto.getBaron());
        entity.setTipo(dto.getTipo());
        entity.setLado(dto.getLado());
        entity.setGold(dto.getGold());
        entity.setResultado(dto.getResultado());
        if (dto.getEstatisticasJogadores() != null) {
            Set<Kda> estatisticas = dto.getEstatisticasJogadores().stream()
                    .map(this::convertKdaDTOToEntity)
                    .collect(Collectors.toSet());
            entity.setEstatisticasJogadores(estatisticas);
        }
    }

    private Kda convertKdaDTOToEntity(KdaDTO dto) {
        Kda kda = new Kda();
        if (dto.getId() != null) {
            kda = kdaRepository.findById(dto.getId()).orElse(new Kda());
        }
        kda.setJogador(jogadorRepository.findById(dto.getIdJogador()).orElseThrow(() -> new IllegalArgumentException("Jogador não encontrado.")));
        kda.setAbates(dto.getAbates());
        kda.setMortes(dto.getMortes());
        kda.setAssistencias(dto.getAssistencias());
        return kda;
    }
}

