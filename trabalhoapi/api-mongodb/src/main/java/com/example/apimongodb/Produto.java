package com.example.apimongodb;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Produto {
    
    @Id
    private String id;

    private String nome;
    private Date dataDeAquisicao;
    private Fornecedor fornecedor;
    private Categoria categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Date getDataDeAquisicao() {
        return dataDeAquisicao;
    }
    
    public void setDataDeAquisicao(Date dataDeAquisicao) {
        this.dataDeAquisicao = dataDeAquisicao;
    }

}
