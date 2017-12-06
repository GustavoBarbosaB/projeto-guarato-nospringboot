package com.projeto.guarato.projetoguarato.controller;


import com.projeto.guarato.projetoguarato.model.Vendedor;
import com.projeto.guarato.projetoguarato.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping
    public List<Vendedor> vendedor(){
        return vendedorRepository.findAll();
    }

}
