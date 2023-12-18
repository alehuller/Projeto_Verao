package br.com.fiap.LoL.repository;

import br.com.fiap.LoL.model.Estrutura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstruturaRepository extends JpaRepository<Estrutura, Long> {

}