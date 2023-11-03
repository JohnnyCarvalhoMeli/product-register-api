package br.com.meli.registerproducpapi.entities.services;

import br.com.meli.registerproducpapi.entities.dto.ProductDto;
import br.com.meli.registerproducpapi.entities.models.ProductModel;
import br.com.meli.registerproducpapi.entities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public String connectionTest() {
        return "Hello World!";
    }

    public String postProduct(ProductDto productDto) {

        System.out.println("Entoru aqui 1");

        ProductModel produto = new ProductModel();

        produto.setId(productDto.getIdproduto());
        produto.setNome(productDto.getNome());
        produto.setValor(productDto.getValor());

        productRepository.save(produto);
        return "Produto salvo com sucesso!";
    }

    public String delete(ProductDto productDto) {
        ProductModel produto = new ProductModel();

        produto.setId(productDto.getIdproduto());

        productRepository.delete(produto);
        return "Produto deletado com sucesso!";
    }

    public String put(ProductDto productDto) {
        ProductModel produto = new ProductModel();

        produto.setId(productDto.getIdproduto());

        productRepository.delete(produto);
        return "Produto atualizado com sucesso!";
    }

}
