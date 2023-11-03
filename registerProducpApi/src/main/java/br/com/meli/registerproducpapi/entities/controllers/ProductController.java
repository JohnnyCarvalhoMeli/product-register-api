package br.com.meli.registerproducpapi.entities.controllers;

import br.com.meli.registerproducpapi.entities.dto.ProductDto;
import br.com.meli.registerproducpapi.entities.models.ProductModel;
import br.com.meli.registerproducpapi.entities.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductModel> getProduct() {
        List<ProductModel> response = productService.getProduct();
        return response;
    }

    @PostMapping
    public String postProduct(@RequestBody ProductDto productDto) {
        String response = productService.postProduct(productDto);
        return response;
    }

    @PutMapping(value = "/{id}")
    public String putProduct(@PathVariable Long id, @RequestBody  ProductDto productDto) {
        String response = productService.put(id, productDto);
        return response;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.delete(id);
    }
}
