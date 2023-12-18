package br.com.fiap.LoL.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CampeonatoDTO {
    private Long id;
    private String nome;
    private Long idTime;
}
