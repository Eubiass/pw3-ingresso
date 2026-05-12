package br.com.etechorario.ingresso.service;
import br.com.etechorario.ingresso.dto.FilmeResponseDTO;
import br.com.etechorario.ingresso.entity.Filme;
import br.com.etechorario.ingresso.enums.SimNaoEnum;
import br.com.etechorario.ingresso.mapper.FilmeMapper;
import br.com.etechorario.ingresso.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private FilmeMapper filmeMapper;

    public List<FilmeResponseDTO> findAll(){
        var filmes = filmeRepository.findAll();
        return filmeMapper.toResponseDTOList(filmes);
    }

    public List<Filme>listarFilmesEmCartaz(){
        return filmeRepository.findAllByEmCartaz(SimNaoEnum.S);
    }

}