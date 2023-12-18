package br.com.fiap.LoL.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TimeDTO {
    private Long id;
    private String nome;
    private Long idJogador;
    private BigDecimal vitorias;
    private BigDecimal derrotas;
}
