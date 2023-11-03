package br.com.meli.registerproducpapi.entities.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id_produto;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor")
    private Double valor;


    public Long getId_produto() {
        return id_produto;
    }

    public void setId_produto(Long id) {
        this.id_produto = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String produto) {
        this.nome = produto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
