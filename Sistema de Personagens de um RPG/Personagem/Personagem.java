package Personagem;
import Ataque.IAtaque;
import Defesa.IDefesa;
public class Personagem{
    private String nome;
    private IAtaque estrategiaDeAtaque;
    private IDefesa estrategiaDeDefesa;

    public Personagem(String nome, IAtaque estrategiaDeAtaque, IDefesa estrategiaDeDefesa){
        this.nome = nome;
        this.estrategiaDeAtaque = estrategiaDeAtaque;
        this.estrategiaDeDefesa = estrategiaDeDefesa;
    }

    public void ataque(){
        System.out.println(nome + "");
        estrategiaDeAtaque.ataque();
    }

    public void defesa(){
        System.out.println(nome+ "");
        estrategiaDeDefesa.defender();
    }

    public void setEstrategiaDeAtaque(IAtaque novaEstrategiaDeAtaque){
        this.estrategiaDeAtaque = novaEstrategiaDeAtaque;
    }

    public void setEstrategiaDeDefesa(IDefesa novaEstrategiaDeDefesa){
        this.estrategiaDeDefesa = novaEstrategiaDeDefesa;
    }
}