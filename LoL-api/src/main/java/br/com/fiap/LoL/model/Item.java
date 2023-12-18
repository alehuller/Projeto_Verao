package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ITEM", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_ITEM", columnNames = "NOME_ITEM")
})
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ITEM")
    @SequenceGenerator(name = "SQ_ITEM", sequenceName = "SQ_ITEM", allocationSize = 1)
    @Column(name = "ID_ITEM")
    private Long id;

    @NotBlank(message = "O campo nome não pode estar vazio.")
    @Column(name = "NOME_ITEM", nullable = false)
    private String nome;

    @Column(name = "VALOR_ITEM", nullable = false)
    @NotBlank(message = "O campo valor não pode estar vazio.")
    private BigDecimal valor;

}
