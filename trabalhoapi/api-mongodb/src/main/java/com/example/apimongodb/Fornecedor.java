package com.example.apimongodb;

import org.springframework.data.annotation.Id;

public class Fornecedor {
    
    @Id
    private String id;

    private String nome;
    private String homePage;
    private String telefone;

    public Fornecedor(String id, String nome, String homePage, String telefone) {
        this.id = id;
        this.setNome(nome);
        this.setHomePage(homePage);
        this.setTelefone(telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
