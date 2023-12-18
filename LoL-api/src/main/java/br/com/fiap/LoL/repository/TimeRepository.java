package br.com.fiap.LoL.repository;

import br.com.fiap.LoL.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {
}
