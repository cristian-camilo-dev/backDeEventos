package com.events.events.services;

import com.events.events.models.Vendedor;
import com.events.events.repositories.VendedorRepositoriry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VendedorService {
        @Autowired
        static
        VendedorRepositoriry vendedorRepositoriry;

        public static ArrayList<Vendedor> obtenerVendedores(){
            return (ArrayList<Vendedor>) vendedorRepositoriry.findAll();
        }

        public Vendedor guardarUsuario(Vendedor vendedor){
            return vendedorRepositoriry.save(vendedor);
        }

}
