package br.com.fiap.LoL.repository;

import br.com.fiap.LoL.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
