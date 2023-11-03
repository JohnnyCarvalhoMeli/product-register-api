package br.com.meli.registerproducpapi.entities.repositories;

import br.com.meli.registerproducpapi.entities.models.ProductModel;
import org.springframework.data.repository.CrudRepository;

//public interface ProductRepository extends JpaRepository<ProductModel, Long> {
public interface ProductRepository extends CrudRepository<ProductModel, Long> {
}
