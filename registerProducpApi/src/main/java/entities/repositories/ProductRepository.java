package entities.repositories;

import entities.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//public interface ProductRepository extends JpaRepository<ProductModel, Long> {
public interface ProductRepository extends CrudRepository<ProductModel, Long> {
}
