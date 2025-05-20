package Cadastro.Dados;

public class Senha {
    public final String hash;
    
    public Senha(String valorPlano){
        if(valorPlano.length() < 6){
              throw new IllegalArgumentException("Senha fraca");
        }
        this.hash = gerarHash(valorPlano);
    }

    public String gerarHash(String valor){
        return Integer.toHexString(valor.hashCode());
    }

}
