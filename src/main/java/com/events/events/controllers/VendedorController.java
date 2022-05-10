package com.events.events.controllers;


import com.events.events.models.Vendedor;
import com.events.events.repositories.VendedorRepositoriry;
import com.events.events.services.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    @Autowired
    VendedorService vendedorService;

    @GetMapping()

    public ArrayList<Vendedor> obtenerVendedores() {
        return VendedorService.obtenerVendedores();
    }

    @PostMapping()
    public Vendedor guardarVendedor(@RequestBody Vendedor vendedor) {
        return this.vendedorService.guardarUsuario(vendedor);


    }
}
