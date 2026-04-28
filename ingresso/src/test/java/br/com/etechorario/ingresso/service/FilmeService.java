package br.com.etechorario.ingresso.service;

import br.com.etechorario.ingresso.entity.Filme;
import br.com.etechorario.ingresso.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> findAll(){
        return filmeRepository.findAll();
    }
}