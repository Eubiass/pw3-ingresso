package br.com.etechorario.ingresso.entity;

import br.com.etechorario.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechorario.ingresso.enums.ClassificacaoIndicativaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_FILME")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FILME")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "NR_DURACAO")
    private Integer duracao;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_CATEGORIA")
    private CategoriaFilmeEnum categoria;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_CLASSIFICACAO")
    private ClassificacaoIndicativaEnum classificacao;

    @Column(name = "CHK_EM_CARTAZ")
    private String emCartaz;

    @Column(name = "NR_ANO")
    private Integer ano;

    @Column(name = "TX_CAPA")
    private String capa;

    @Column(name = "TX_DIRETOR")
    private String diretor;

    @Column(name = "TX_ELENCO")
    private String elenco;

    @Column(name = "TX_DESCRICAO")
    private String descricao;

    @Column(name = "NR_AVALIACAO")
    private Double avaliacao;
}

