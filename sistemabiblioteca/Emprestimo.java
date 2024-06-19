package com.mycompany.sistemabiblioteca;

public class Emprestimo {
    private Publicacao publicacao;
    private String dataEmprestimo;
    private int numeroDeRenovacoes;
    private UsuarioEspecial usuarioEspecial;
    private UsuarioComum usuarioComum;

    public Emprestimo(Publicacao publicacao, String dataEmprestimo, UsuarioEspecial usuarioEspecial, UsuarioComum usuarioComum) {
        this.publicacao = publicacao;
        this.dataEmprestimo = dataEmprestimo;
        this.numeroDeRenovacoes = 0;
        this.usuarioEspecial = usuarioEspecial;
        this.usuarioComum = usuarioComum;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getNumeroDeRenovacoes() {
        return numeroDeRenovacoes;
    }

    public void setNumeroDeRenovacoes(int numeroDeRenovacoes) {
        this.numeroDeRenovacoes = numeroDeRenovacoes + 1;
    }
    
    public boolean calcularMulta(){
        if(this.numeroDeRenovacoes > 3){
            return true;
        }
        return false;
    }
}
