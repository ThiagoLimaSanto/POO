package com.mycompany.sistemabiblioteca;

public class UsuarioComum extends Usuario{
    private boolean emprestimo;
    
    public UsuarioComum(String name, String telefone, String email, String cpf) {
        super(name, telefone, email, cpf);
        this.emprestimo = false;
    }

    public boolean podeEmprestimo() {
        if("false".equals(this.emprestimo)){
            return true;
        }
        return false;
    }
}
