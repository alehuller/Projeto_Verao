package br.com.fiap.LoL.model;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARTIDAATUAL")
public class PartidaAtual {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PARTIDAATUAL")
    @SequenceGenerator(name = "SQ_PARTIDAATUAL", sequenceName = "SQ_PARTIDAATUAL", allocationSize = 1)
    @Column(name = "ID_PARTIDAATUAL")
    private Long id;

    @Column(name = "CAMPEONATO")
    private String campeonato;

    @Column(name = "TIMEAZUL")
    private String timeAzul;

    @Column(name = "TIMEVERMELHO")
    private String timeVermelho;

    @Column(name = "TOPAZUL")
    private String topAzul;

    @Column(name = "JUNGLEAZUL")
    private String jungleAzul;

    @Column(name = "MIDAZUL")
    private String midAzul;

    @Column(name = "ADCAZUL")
    private String adcAzul;

    @Column(name = "SUPPAZUL")
    private String suppAzul;

    @Column(name = "TOPVERMELHO")
    private String topVermelho;

    @Column(name = "JUNGLEVERMELHO")
    private String jungleVermelho;

    @Column(name = "MIDVERMELHO")
    private String midVermelho;

    @Column(name = "ADCVERMELHO")
    private String adcVermelho;

    @Column(name = "SUPPVERMELHO")
    private String suppVermelho;
}
