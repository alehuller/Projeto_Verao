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

    @Column(name = "BARONAZUL")
    private String baronAzul;

    @Column(name = "BARONVERMELHO")
    private String baronVermelho;

    @Column(name = "DRAGAOMONTANHAAZUL")
    private String dragaoMontanhaAzul;

    @Column(name = "DRAGAOMONTANHAVERMELHO")
    private String dragaoMontanhaVermelho;

    @Column(name = "DRAGAOOCEANOAZUL")
    private String dragaoOceanoAzul;

    @Column(name = "DRAGAOOCEANOVERMELHO")
    private String dragaoOceanoVermelho;

    @Column(name = "DRAGAOINFERNALAZUL")
    private String dragaoInfernalAzul;

    @Column(name = "DRAGAOINFERNALVERMELHO")
    private String dragaoInfernalVermelho;

    @Column(name = "DRAGAOHEXTECHAZUL")
    private String dragaoHextechAzul;

    @Column(name = "DRAGAOHEXTECHVERMELHO")
    private String dragaoHextechVermelho;

    @Column(name = "DRAGAOCHEMTECHAZUL")
    private String dragaoChemtechAzul;

    @Column(name = "DRAGAOCHEMTECHVERMELHO")
    private String dragaoChemtechVermelho;

    @Column(name = "DRAGAOANCIAOAZUL")
    private String dragaoAnciaoAzul;

    @Column(name = "DRAGAOANCIAOVERMELHO")
    private String dragaoAnciaoVermelho;

    @Column(name = "PONTOSAZUL")
    private String pontosAzul;

    @Column(name = "PONTOSVERMELHO")
    private String pontosVermelho;

    @Column(name = "DRAGAONUVEMAZUL")
    private String dragaoNuvemAzul;

    @Column(name = "DRAGAONUVEMVERMELHO")
    private String dragaoNuvemVermelho;

    @Column(name = "PONTOSTOPAZUL")
    private String pontosTopAzul;

    @Column(name = "PONTOSTOPVERMELHO")
    private String pontosTopVermelho;

    @Column(name = "PONTOSJUNGLEAZUL")
    private String pontosJungleAzul;

    @Column(name = "PONTOSJUNGLEVERMELHO")
    private String pontosJungleVermelho;

    @Column(name = "PONTOSMIDAZUL")
    private String pontosMidAzul;

    @Column(name = "PONTOSMIDVERMELHO")
    private String pontosMidVermelho;

    @Column(name = "PONTOSADCAZUL")
    private String pontosAdcAzul;

    @Column(name = "PONTOSADCVERMELHO")
    private String pontosAdcVermelho;

    @Column(name = "PONTOSSUPPAZUL")
    private String pontosSuppAzul;

    @Column(name = "PONTOSSUPPVERMELHO")
    private String pontosSuppVermelho;

    @Column(name = "itemumtop")
    private String itemUmTop;

    @Column(name = "itemdoistop")
    private String itemDoisTop;

    @Column(name = "itemtrestop")
    private String itemTresTop;

    @Column(name = "itemquatrotop")
    private String itemQuatroTop;

    @Column(name = "itemcincotop")
    private String itemCincoTop;

    @Column(name = "itemseistop")
    private String itemSeisTop;

    @Column(name = "ITEMDOISJUNGLEAZUL")
    private String ItemDoisJungleAzul;

    @Column(name = "ITEMCINCOJUNGLEAZUL")
    private String ItemCincoJungleAzul;

    @Column(name = "ITEMDOISMIDAZUL")
    private String ItemDoisMidAzul;

    @Column(name = "ITEMCINCOMIDAZUL")
    private String ItemCincoMidAzul;

    @Column(name = "ITEMDOISADCAZUL")
    private String ItemDoisAdcAzul;

    @Column(name = "ITEMCINCOADCAZUL")
    private String ItemCincoAdcAzul;

    @Column(name = "ITEMDOISSUPPAZUL")
    private String ItemDoisSuppAzul;

    @Column(name = "ITEMCINCOSUPPAZUL")
    private String ItemCincoSuppAzul;

    @Column(name = "ITEMCINCOTOPVERMELHO")
    private String ItemCincoTopVermelho;

    @Column(name = "ITEMDOISJUNGLEVERMELHO")
    private String ItemDoisJungleVermelho;

    @Column(name = "ITEMCINCOJUNGLEVERMELHO")
    private String ItemCincoJungleVermelho;

    @Column(name = "ITEMDOISMIDVERMELHO")
    private String ItemDoisMidVermelho;

    @Column(name = "ITEMCINCOMIDVERMELHO")
    private String ItemCincoMidVermelho;

    @Column(name = "ITEMDOISADCVERMELHO")
    private String ItemDoisAdcVermelho;

    @Column(name = "ITEMCINCOADCVERMELHO")
    private String ItemCincoAdcVermelho;

    @Column(name = "ITEMDOISSUPPVERMELHO")
    private String ItemDoisSuppVermelho;

    @Column(name = "ITEMCINCOSUPPVERMELHO")
    private String ItemCincoSuppVermelho;
}
