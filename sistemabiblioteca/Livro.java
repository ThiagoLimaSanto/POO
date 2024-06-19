package com.mycompany.sistemabiblioteca;

public class Livro extends Publicacao{
    private String numeroDeEdicao;
    private String nomeDaEditora;
    private String iSBN;

    public Livro(String numeroDeEdicao, String nomeDaEditora, String iSBN, String dataDePublicacao, String titulo, String listaDeoutrasPublicacoes, String conjuntoDeAutoresDaPublicacao) {
        super(dataDePublicacao, titulo, listaDeoutrasPublicacoes, conjuntoDeAutoresDaPublicacao);
        this.numeroDeEdicao = numeroDeEdicao;
        this.nomeDaEditora = nomeDaEditora;
        this.iSBN = iSBN;
    }

    public String getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public void setNumeroDeEdicao(String numeroDeEdicao) {
        this.numeroDeEdicao = numeroDeEdicao;
    }

    public String getNomeDaEditora() {
        return nomeDaEditora;
    }

    public void setNomeDaEditora(String nomeDaEditora) {
        this.nomeDaEditora = nomeDaEditora;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }
    
}
