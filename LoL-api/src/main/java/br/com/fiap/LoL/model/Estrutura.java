package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ESTRUTURA", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_ESTRUTURA", columnNames = "NOME_ESTRUTURA")
})
public class Estrutura {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTRUTURA")
    @SequenceGenerator(name = "SQ_ESTRUTURA", sequenceName = "SQ_ESTRUTURA", allocationSize = 1)
    @Column(name = "ID_ESTRUTURA")
    private Long id;

    @NotBlank(message = "O campo nome não pode estar vazio.")
    @Column(name = "NOME_ESTRUTURA", nullable = false)
    private String nome;

}
