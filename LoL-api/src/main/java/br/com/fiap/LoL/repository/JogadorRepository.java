package br.com.fiap.LoL.repository;

import br.com.fiap.LoL.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}

