package br.com.fiap.LoL.repository;

import br.com.fiap.LoL.model.Dragao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DragaoRepository extends JpaRepository<Dragao, Long> {

}