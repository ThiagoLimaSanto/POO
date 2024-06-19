package com.mycompany.sistemabiblioteca;

public class tese extends Publicacao{
    private String numeroDePaginas;
    private String resumo;
    private String dataDaDefesa;
    private String instituicaoQueATeseFoiDefendida;

    public tese(String numeroDePaginas, String resumo, String dataDaDefesa, String instituicaoQueATeseFoiDefendida, String dataDePublicacao, String titulo, String listaDeoutrasPublicacoes, String conjuntoDeAutoresDaPublicacao) {
        super(dataDePublicacao, titulo, listaDeoutrasPublicacoes, conjuntoDeAutoresDaPublicacao);
        this.numeroDePaginas = numeroDePaginas;
        this.resumo = resumo;
        this.dataDaDefesa = dataDaDefesa;
        this.instituicaoQueATeseFoiDefendida = instituicaoQueATeseFoiDefendida;
    }

    public String getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(String numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDaDefesa() {
        return dataDaDefesa;
    }

    public void setDataDaDefesa(String dataDaDefesa) {
        this.dataDaDefesa = dataDaDefesa;
    }

    public String getInstituicaoQueATeseFoiDefendida() {
        return instituicaoQueATeseFoiDefendida;
    }

    public void setInstituicaoQueATeseFoiDefendida(String instituicaoQueATeseFoiDefendida) {
        this.instituicaoQueATeseFoiDefendida = instituicaoQueATeseFoiDefendida;
    }
    
}
