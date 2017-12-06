package com.projeto.guarato.projetoguarato.repository;


import com.projeto.guarato.projetoguarato.model.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompradorRepository extends JpaRepository<Comprador,String> {

    Comprador findByCpf(String cpf);
}
