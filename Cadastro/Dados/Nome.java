package Cadastro.Dados;

public class Nome {
    private final String nome;


    public Nome(String nome){
        if(nome == null){
            throw new IllegalArgumentException ("Nome invalido");
        }
        this.nome = nome;
    }

    public void exibirMensagem(){
        System.out.println("Bem vindo, " +nome);
    }
}
