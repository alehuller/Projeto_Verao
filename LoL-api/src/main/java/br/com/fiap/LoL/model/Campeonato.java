package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAMPEONATO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NOME_CAMPEONATO", columnNames = "NOME_CAMPEONATO")
})
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CAMPEONATO")
    @SequenceGenerator(name = "SQ_CAMPEONATO", sequenceName = "SQ_CAMPEONATO", allocationSize = 1)
    @Column(name = "ID_CAMPEONATO")
    private Long id;

    @Column(name = "NOME_CAMPEONATO", nullable = false)
    @NotBlank(message = "O campo nome não pode estar vazio.")
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_TIME", referencedColumnName = "ID_TIME", foreignKey = @ForeignKey(name = "FK_CAMPEONATO_TIME"), nullable = false)
    @NotNull(message = "O campo time não pode estar vazio.")
    private Time time;
}
