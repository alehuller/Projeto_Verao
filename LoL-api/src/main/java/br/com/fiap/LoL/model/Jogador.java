package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.*;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JOGADOR", uniqueConstraints = {
        @UniqueConstraint(name = "UK_JOGADOR_UNICO", columnNames =  "FUNCAO_JOGADOR")
})
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_JOGADOR")
    @SequenceGenerator(name = "SQ_JOGADOR", sequenceName = "SQ_JOGADOR", allocationSize = 1)
    @Column(name = "ID_JOGADOR")
    private Long id;

    @Column(name = "NOME_JOGADOR", nullable = false)
    @NotBlank(message = "O campo nome não pode estar vazio.")
    private String nome;

    @Column(name = "FUNCAO_JOGADOR", nullable = false)
    @NotBlank(message = "O campo função não pode estar vazio.")
    private String funcao;

    @OneToMany(mappedBy = "jogador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Kda> estatisticasPartidas;

}