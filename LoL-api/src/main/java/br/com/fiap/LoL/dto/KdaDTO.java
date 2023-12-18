package br.com.fiap.LoL.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KdaDTO {
    private Long id;
    private Long idPartida;
    private Long idJogador;
    private int abates;
    private int mortes;
    private int assistencias;
}
