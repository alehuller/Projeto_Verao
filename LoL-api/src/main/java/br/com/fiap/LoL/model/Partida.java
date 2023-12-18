package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARTIDA")
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PARTIDA")
    @SequenceGenerator(name = "SQ_PARTIDA", sequenceName = "SQ_PARTIDA", allocationSize = 1)
    @Column(name = "ID_PARTIDA")
    private Long id;

    @Column(name = "DATA_PARTIDA", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_CAMPEONATO", referencedColumnName = "ID_CAMPEONATO", foreignKey = @ForeignKey(name = "FK_PARTIDA_CAMPEONATO"), nullable = false)
    @NotBlank(message = "O campo campeonato não pode estar vazio.")
    private Campeonato campeonato;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_TIME", referencedColumnName = "ID_TIME", foreignKey = @ForeignKey(name = "FK_PARTIDA_TIME"), nullable = false)
    @NotBlank(message = "O campo time não pode estar vazio.")
    private Time time;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_ITEM", referencedColumnName = "ID_ITEM", foreignKey = @ForeignKey(name = "FK_PARTIDA_ITEM"), nullable = false)
    private Item item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_DRAGAO", referencedColumnName = "ID_DRAGAO", foreignKey = @ForeignKey(name = "FK_PARTIDA_DRAGAO"), nullable = false)
    private Dragao dragao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_ESTRUTURA", referencedColumnName = "ID_ESTRUTURA", foreignKey = @ForeignKey(name = "FK_PARTIDA_ESTRUTURA"), nullable = false)
    private Estrutura estrutura;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_CHAMPION", referencedColumnName = "ID_CHAMPION", foreignKey = @ForeignKey(name = "FK_PARTIDA_CHAMPION"), nullable = false)
    private Champion champion;

    @Column(name = "ARAUTO_PARTIDA")
    private Long arauto;

    @Column(name = "BARON_PARTIDA")
    private Long baron;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_PARTIDA", nullable = false)
    private TipoPartida tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "LADO_PARTIDA", nullable = false)
    private Lado lado;

    @Column(name = "GOLD_DIFF_PARTIDA", nullable = false)
    @PositiveOrZero
    private BigDecimal gold;

    @OneToMany(mappedBy = "partida", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Kda> estatisticasJogadores;

    @Enumerated(EnumType.STRING)
    @Column(name = "RESULTADO_PARTIDA", nullable = false)
    private ResultadoPartida resultado;

    public enum TipoPartida {
        FASE_PONTOS,
        PLAYOFFS
    }

    public enum ResultadoPartida {
        VITORIA,
        DERROTA
    }

    public enum Lado {
        BLUE,
        RED
    }
}

