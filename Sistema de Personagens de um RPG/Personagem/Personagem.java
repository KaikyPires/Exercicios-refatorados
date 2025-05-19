import Ataque.IAtaque;

package Personagem;
public class Personagem{
    private String nome;
    private IAtaque estrategiaDeAtaque;

    public Personagem(String nome, IAtaque estrategiaDeAtaque){
        this.nome = nome;
        this.estrategiaDeAtaque = estrategiaDeAtaque;
    }

    public void ataque(){
        System.out.println(nome + "");
        estrategiaDeAtaque.ataque();
    }

    public void setEstrategiaDeAtaque(IAtaque novaEstrategia){
        this.estrategiaDeAtaque = novaEstrategia;
    }

}