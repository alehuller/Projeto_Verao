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
@Table(name = "PARTIDAATUALDOIS")
public class PartidaAtualDois {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PARTIDAATUALDOIS")
    @SequenceGenerator(name = "SQ_PARTIDAATUALDOIS", sequenceName = "SQ_PARTIDAATUALDOIS", allocationSize = 1)
    @Column(name = "ID_PARTIDAATUALDOIS")
    private Long id;

    @Column(name = "ITEMUMJUNGLEAZUL")
    private String ItemUmJungleAzul;

    @Column(name = "ITEMTRESJUNGLEAZUL")
    private String ItemTresJungleAzul;

    @Column(name = "ITEMQUARTOJUNGLEAZUL")
    private String ItemQuartoJungleAzul;

    @Column(name = "ITEMSEISJUNGLEAZUL")
    private String ItemSeisJungleAzul;

    @Column(name = "ITEMUMMIDAZUL")
    private String ItemUmMidAzul;

    @Column(name = "ITEMTRESMIDAZUL")
    private String ItemTresMidAzul;

    @Column(name = "ITEMQUATROMIDAZUL")
    private String ItemQuatroMidAzul;

    @Column(name = "ITEMSEISMIDAZUL")
    private String ItemSeisMidAzul;

    @Column(name = "ITEMUMADCAZUL")
    private String ItemUmAdcAzul;

    @Column(name = "ITEMDOISADCAZUL")
    private String ItemDoisAdcAzul;

    @Column(name = "ITEMTRESADCAZUL")
    private String ItemTresAdcAzul;

    @Column(name = "ITEMQUATROADCAZUL")
    private String ItemQuartoAdcAzul;

    @Column(name = "ITEMSEISADCAZUL")
    private String ItemSeisAdcAzul;

    @Column(name = "ITEMUMSUPPAZUL")
    private String ItemUmSuppAzul;

    @Column(name = "ITEMDOISSUPPAZUL")
    private String ItemDoisSuppAzul;

    @Column(name = "ITEMTRESSUPPAZUL")
    private String ItemTresSuppAzul;

    @Column(name = "ITEMQUATROSUPPAZUL")
    private String ItemQuatroSuppAzul;

    @Column(name = "ITEMSEISSUPPAZUL")
    private String ItemSeisSuppAzul;

    @Column(name = "ITEMUMTOPVERMELHO")
    private String ItemUmTopVermelho;

    @Column(name = "ITEMDOISTOPVERMELHO")
    private String ItemDoisTopVermelho;

    @Column(name = "ITEMTRESTOPVERMELHO")
    private String ItemTresTopVermelho;

    @Column(name = "ITEMQUATROTOPVERMELHO")
    private String ItemQuatroTopVermelho;

    @Column(name = "ITEMSEISTOPVERMELHO")
    private String ItemSeisTopVermelho;

    @Column(name = "ITEMUMJUNGLEVERMELHO")
    private String ItemUmJungleVermelho;

    @Column(name = "ITEMDOISJUNGLEVERMELHO")
    private String ItemDoisJungleVermelho;

    @Column(name = "ITEMTRESJUNGLEVERMELHO")
    private String ItemTresJungleVermelho;

    @Column(name = "ITEMQUATROJUNGLEVERMELHO")
    private String ItemQuatroJungleVermelho;

    @Column(name = "ITEMSEISJUNGLEVERMELHO")
    private String ItemSeisJungleVermelho;

    @Column(name = "ITEMUMMIDVERMELHO")
    private String ItemUmMidVermelho;

    @Column(name = "ITEMDOISMIDVERMELHO")
    private String ItemDoisMidVermelho;

    @Column(name = "ITEMTRESMIDVERMELHO")
    private String ItemTresMidVermelho;

    @Column(name = "ITEMQUATROMIDVERMELHO")
    private String ItemQuatroMidVermelho;

    @Column(name = "ITEMSEISMIDVERMELHO")
    private String ItemSeisMidVermelho;

    @Column(name = "ITEMUMADCVERMELHO")
    private String ItemUmAdcVermelho;

    @Column(name = "ITEMDOISADCVERMELHO")
    private String ItemDoisAdcVermelho;

    @Column(name = "ITEMTRESADCVERMELHO")
    private String ItemTresAdcVermelho;

    @Column(name = "ITEMQUATROADCVERMELHO")
    private String ItemQuatroAdcVermelho;

    @Column(name = "ITEMSEISADCVERMELHO")
    private String ItemSeisAdcVermelho;

    @Column(name = "ITEMUMSUPPVERMELHO")
    private String ItemUmSuppVermelho;

    @Column(name = "ITEMDOISSUPPVERMELHO")
    private String ItemDoisSuppVermelho;

    @Column(name = "ITEMTRESSUPPVERMELHO")
    private String ItemTresSuppVermelho;

    @Column(name = "ITEMQUATROSUPPVERMELHO")
    private String ItemQuatroSuppVermelho;

    @Column(name = "ITEMSEISSUPPVERMELHO")
    private String ItemSeisSuppVermelho;
}
