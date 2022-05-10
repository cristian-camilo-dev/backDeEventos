package com.events.events.repositories;

import com.events.events.models.Vendedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VendedorRepositoriry extends CrudRepository<Vendedor, Long> {

}
