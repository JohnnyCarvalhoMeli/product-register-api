package br.com.meli.registerproducpapi.entities.services;

import br.com.meli.registerproducpapi.entities.dto.ProductDto;
import br.com.meli.registerproducpapi.entities.models.ProductModel;
import br.com.meli.registerproducpapi.entities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<ProductModel> getProduct() {
        return productRepository.findAll();
    }


    public String postProduct(ProductDto productDto) {

        System.out.println("Entoru aqui 1");

        ProductModel produto = new ProductModel();

        produto.setNome(productDto.getNome());
        produto.setValor(productDto.getValor());

        productRepository.save(produto);
        return "Produto salvo com sucesso!";
    }

    public void delete(Long id) {

        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        }
    }



    public String put(Long id, ProductDto productDto) {

        Optional<ProductModel> result = productRepository.findById(id);
        if (result.isPresent()) {
            ProductModel product = result.get();
            product.setNome(productDto.getNome());
            product.setValor((productDto.getValor()));
            productRepository.save(product);
            return "Produto atualizado com sucesso!";
        }
        return "Produto não encontrado";
    }
}
