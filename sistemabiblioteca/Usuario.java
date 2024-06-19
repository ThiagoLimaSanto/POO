package com.mycompany.sistemabiblioteca;

public abstract class Usuario {
    private String name;
    private String telefone;
    private String email;
    private String cpf;

    public Usuario(String name, String telefone, String email, String cpf) {
        this.name = name;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
