package Cadastro.Dados;

public class Email {
    public final String endereco;

    public Email(String endereco){
          if (!endereco.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.endereco = endereco;
    }
}
