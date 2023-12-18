package br.com.fiap.LoL.repository;

import br.com.fiap.LoL.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}

