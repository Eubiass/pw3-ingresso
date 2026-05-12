package br.com.etechorario.ingresso.mapper;

import br.com.etechorario.ingresso.dto.FilmeResponseDTO;
import br.com.etechorario.ingresso.entity.Filme;
import br.com.etechorario.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechorario.ingresso.enums.ClassificacaoIndicativaEnum;
import br.com.etechorario.ingresso.enums.SimNaoEnum;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-12T14:31:13-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 25.0.1 (Oracle Corporation)"
)
@Component
public class FilmeMapperImpl implements FilmeMapper {

    @Override
    public List<FilmeResponseDTO> toResponseDTOList(List<Filme> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FilmeResponseDTO> list = new ArrayList<FilmeResponseDTO>( entities.size() );
        for ( Filme filme : entities ) {
            list.add( filmeToFilmeResponseDTO( filme ) );
        }

        return list;
    }

    protected FilmeResponseDTO filmeToFilmeResponseDTO(Filme filme) {
        if ( filme == null ) {
            return null;
        }

        Long id = null;
        String nome = null;
        Integer duracao = null;
        Integer ano = null;
        String capa = null;
        CategoriaFilmeEnum categoria = null;
        ClassificacaoIndicativaEnum classificacao = null;
        SimNaoEnum emCartaz = null;
        String diretor = null;
        String elenco = null;
        String descricao = null;
        Double avaliacao = null;

        id = filme.getId();
        nome = filme.getNome();
        duracao = filme.getDuracao();
        ano = filme.getAno();
        capa = filme.getCapa();
        categoria = filme.getCategoria();
        classificacao = filme.getClassificacao();
        if ( filme.getEmCartaz() != null ) {
            emCartaz = Enum.valueOf( SimNaoEnum.class, filme.getEmCartaz() );
        }
        diretor = filme.getDiretor();
        elenco = filme.getElenco();
        descricao = filme.getDescricao();
        avaliacao = filme.getAvaliacao();

        FilmeResponseDTO filmeResponseDTO = new FilmeResponseDTO( id, nome, duracao, ano, capa, categoria, classificacao, emCartaz, diretor, elenco, descricao, avaliacao );

        return filmeResponseDTO;
    }
}
