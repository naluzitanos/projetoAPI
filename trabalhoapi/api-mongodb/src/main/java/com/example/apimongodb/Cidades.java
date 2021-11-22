package com.example.apimongodb;

import org.springframework.data.annotation.Id;

public class Cidades {

    @Id
    private String id;

    private String nome;
    private String estado;
    private String pais;

    public Cidades(String id, String nome, String estado, String pais) {
        this.id = id;
        this.setNome(nome);
        this.setEstado(estado);
        this.setPais(pais);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
