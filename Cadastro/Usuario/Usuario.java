package Cadastro.Usuario;

import Cadastro.Dados.Email;
import Cadastro.Dados.Nome;
import Cadastro.Dados.Senha;

public class Usuario {
    private final Nome nome;
    private final Email email;
    private final Senha senha;

    public Usuario(Nome nome, Email email, Senha senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
