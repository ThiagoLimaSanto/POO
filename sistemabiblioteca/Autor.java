package com.mycompany.sistemabiblioteca;

public class Autor {
    private String name;
    private String titulacao;

    public Autor(String name, String titulacao) {
        this.name = name;
        this.titulacao = titulacao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
}
