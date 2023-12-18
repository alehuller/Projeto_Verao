package br.com.fiap.LoL.dto;

import br.com.fiap.LoL.model.Partida.TipoPartida;
import br.com.fiap.LoL.model.Partida.Lado;
import br.com.fiap.LoL.model.Partida.ResultadoPartida;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartidaDTO {
    private Long id;
    private Date data;
    private Long idCampeonato;
    private Long idTime;
    private Long idItem;
    private Long idDragao;
    private Long idEstrutura;
    private Long idChampion;
    private Long arauto;
    private Long baron;
    private TipoPartida tipo;
    private Lado lado;
    private BigDecimal gold;
    private Set<KdaDTO> estatisticasJogadores;
    private ResultadoPartida resultado;
}
