package br.com.fiap.LoL.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JogadorDTO {
    private Long id;
    private String nome;
    private String funcao;
    private Set<Long> idsEstatisticasPartidas;
}
