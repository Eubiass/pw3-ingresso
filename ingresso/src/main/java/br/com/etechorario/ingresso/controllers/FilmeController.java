package br.com.etechorario.ingresso.controllers;
import br.com.etechorario.ingresso.dto.FilmeResponseDTO;
import br.com.etechorario.ingresso.entity.Filme;
import br.com.etechorario.ingresso.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<FilmeResponseDTO> findAll(){
        return filmeService.findAll();
    }

    @GetMapping("/em-cartaz")
    public List<Filme> buscarEmCartaz(){
        return filmeService.listarFilmesEmCartaz();
    }
}
