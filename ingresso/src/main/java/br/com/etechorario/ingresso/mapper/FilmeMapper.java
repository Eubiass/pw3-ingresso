package br.com.etechorario.ingresso.mapper;

import br.com.etechorario.ingresso.dto.FilmeResponseDTO;
import br.com.etechorario.ingresso.entity.Filme;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmeMapper {
    List<FilmeResponseDTO> toResponseDTOList(List<Filme> entities);
}
