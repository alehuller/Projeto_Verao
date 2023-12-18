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
@Table(name = "DRAGAO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_DRAGAO", columnNames = "NOME_DRAGAO")
})
public class Dragao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DRAGAO")
    @SequenceGenerator(name = "SQ_DRAGAO", sequenceName = "SQ_DRAGAO", allocationSize = 1)
    @Column(name = "ID_DRAGAO")
    private Long id;

    @NotBlank(message = "O campo nome não pode estar vazio.")
    @Column(name = "NOME_DRAGAO", nullable = false)
    private String nome;

}