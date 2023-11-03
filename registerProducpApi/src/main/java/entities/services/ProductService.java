package entities.services;

import entities.dto.ProductDto;
import entities.models.ProductModel;
import entities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
