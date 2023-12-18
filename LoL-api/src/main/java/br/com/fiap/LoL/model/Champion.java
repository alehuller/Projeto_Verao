package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CHAMPION", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_CHAMPION", columnNames = "NOME_CHAMPION")
})
public class Champion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CHAMPION")
    @SequenceGenerator(name = "SQ_CHAMPION", sequenceName = "SQ_CHAMPION", allocationSize = 1)
    @Column(name = "ID_CHAMPION")
    private Long id;

    @NotBlank(message = "O campo nome não pode estar vazio.")
    @Column(name = "NOME_CHAMPION", nullable = false)
    private String nome;
}