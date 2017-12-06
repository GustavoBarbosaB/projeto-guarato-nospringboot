package com.projeto.guarato.projetoguarato.repository;


import com.projeto.guarato.projetoguarato.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor,String> {

        Vendedor findByCnpj(String cnpj);

}
