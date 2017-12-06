package com.projeto.guarato.projetoguarato.service;

import com.projeto.guarato.projetoguarato.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository vendedorRepository;

    public void save(){

    }

    public void delete(String cnpj) {
        vendedorRepository.delete(cnpj);
    }
}
