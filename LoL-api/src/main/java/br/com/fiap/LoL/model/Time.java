package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TIME", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_TIME", columnNames = "NOME_TIME")
})
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TIME")
    @SequenceGenerator(name = "SQ_TIME", sequenceName = "SQ_TIME", allocationSize = 1)
    @Column(name = "ID_TIME")
    private Long id;

    @Column(name = "NOME_TIME", nullable = false)
    @NotBlank(message = "O campo nome não pode estar vazio.")
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_JOGADOR", referencedColumnName = "ID_JOGADOR", foreignKey = @ForeignKey(name = "FK_TIME_JOGADOR"), nullable = false)
    @NotNull(message = "O campo jogador não pode estar vazio.")
    private Jogador jogador;

    @Column(name = "VITORIAS_TIME", nullable = false)
    @PositiveOrZero
    @NotNull(message = "O campo vitorias não pode estar vazio.")
    private BigDecimal vitorias;

    @Column(name = "DERROTAS_TIME", nullable = false)
    @PositiveOrZero
    @NotNull(message = "O campo derrotas não pode estar vazio.")
    private BigDecimal derrotas;

    
}