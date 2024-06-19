package com.mycompany.sistemabiblioteca;

public abstract class Publicacao {
    private String dataDePublicacao;
    private String titulo;
    private String listaDeoutrasPublicacoes;
    private String conjuntoDeAutoresDaPublicacao;

    public Publicacao(String dataDePublicacao, String titulo, String listaDeoutrasPublicacoes, String conjuntoDeAutoresDaPublicacao) {
        this.dataDePublicacao = dataDePublicacao;
        this.titulo = titulo;
        this.listaDeoutrasPublicacoes = listaDeoutrasPublicacoes;
        this.conjuntoDeAutoresDaPublicacao = conjuntoDeAutoresDaPublicacao;
    }

    public String getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(String dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getListaDeoutrasPublicacoes() {
        return listaDeoutrasPublicacoes;
    }

    public void setListaDeoutrasPublicacoes(String listaDeoutrasPublicacoes) {
        this.listaDeoutrasPublicacoes = listaDeoutrasPublicacoes;
    }

    public String getConjuntoDeAutoresDaPublicacao() {
        return conjuntoDeAutoresDaPublicacao;
    }

    public void setConjuntoDeAutoresDaPublicacao(String conjuntoDeAutoresDaPublicacao) {
        this.conjuntoDeAutoresDaPublicacao = conjuntoDeAutoresDaPublicacao;
    }
    
}
