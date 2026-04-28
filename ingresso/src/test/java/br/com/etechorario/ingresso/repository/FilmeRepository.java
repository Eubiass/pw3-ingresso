package br.com.etechorario.ingresso.repository;

import br.com.etechorario.ingresso.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
