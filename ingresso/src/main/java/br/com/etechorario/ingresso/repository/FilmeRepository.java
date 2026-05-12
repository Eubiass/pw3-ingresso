package br.com.etechorario.ingresso.repository;

import br.com.etechorario.ingresso.entity.Filme;
import br.com.etechorario.ingresso.enums.SimNaoEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    List<Filme> findAllByEmCartaz(SimNaoEnum emCartaz);
}
