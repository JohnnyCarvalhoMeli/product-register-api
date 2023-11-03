package br.com.meli.registerproducpapi.entities.repositories;

import br.com.meli.registerproducpapi.entities.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}

