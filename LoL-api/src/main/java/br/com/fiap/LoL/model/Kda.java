package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "KDA")
public class Kda {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_KDA")
    @SequenceGenerator(name = "SQ_KDA", sequenceName = "SQ_KDA", allocationSize = 1)
    @Column(name = "ID_KDA")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_PARTIDA", referencedColumnName = "ID_PARTIDA", foreignKey = @ForeignKey(name = "FK_KDA_PARTIDA"), nullable = false)
    private Partida partida;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_JOGADOR", referencedColumnName = "ID_JOGADOR", foreignKey = @ForeignKey(name = "FK_KDA_JOGADOR"), nullable = false)
    private Jogador jogador;

    @Column(name = "ABATES_KDA")
    private int abates;

    @Column(name = "MORTES_KDA")
    private int mortes;

    @Column(name = "ASSISTENCIAS_KDA")
    private int assistencias;
}
