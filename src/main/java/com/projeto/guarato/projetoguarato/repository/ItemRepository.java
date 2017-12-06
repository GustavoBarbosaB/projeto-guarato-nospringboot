package com.projeto.guarato.projetoguarato.repository;


import com.projeto.guarato.projetoguarato.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

    Item findById(int id);
}
