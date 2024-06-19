package com.mycompany.sistemabiblioteca;

public class Artigo extends Publicacao{
    private String resumo;

    public Artigo(String resumo, String dataDePublicacao, String titulo, String listaDeoutrasPublicacoes, String conjuntoDeAutoresDaPublicacao) {
        super(dataDePublicacao, titulo, listaDeoutrasPublicacoes, conjuntoDeAutoresDaPublicacao);
        this.resumo = resumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
}
