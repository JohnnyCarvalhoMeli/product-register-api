package br.com.meli.registerproducpapi.entities.controllers;

import br.com.meli.registerproducpapi.entities.dto.ProductDto;
import br.com.meli.registerproducpapi.entities.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String getProduct() {
        return productService.connectionTest();
    }

    @PostMapping
    public String postProduct(@RequestBody ProductDto productDto) {
        String response = productService.postProduct(productDto);
        return response;
    }

    @DeleteMapping
    public String deleteProduct(ProductDto productDto) {
        String response = productService.delete(productDto);
        return response;
    }

    @PutMapping
    public String putProduct(ProductDto productDto) {
        String response = productService.put(productDto);
        return response;
    }
}
