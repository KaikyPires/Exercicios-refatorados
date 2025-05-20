package Cadastro;

import Cadastro.Dados.Email;
import Cadastro.Dados.Nome;
import Cadastro.Dados.Senha;
import Cadastro.Usuario.Usuario;

public class Main {
    public static void main(String[] args) {
        Nome nome = new Nome("Kaiky");
        Email email = new Email("kaiky@ifmg.edu.br");
        Senha senha = new Senha("123456");

        Usuario usuario = new Usuario(nome, email, senha);

        usuario.mostrarMensagemDeBoasVindas();

        Senha tentativa = new Senha("123456");
        if (usuario.autenticar(tentativa)) {
            System.out.println("Autenticado com sucesso!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}

