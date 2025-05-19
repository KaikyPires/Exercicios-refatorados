package Jogo;
import Ataque.AtaqueEspada;
import Ataque.AtaqueMagia;
import Personagem.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Guerreiro", new AtaqueEspada());
        guerreiro.ataque();

        guerreiro.setEstrategiaDeAtaque(new AtaqueMagia());
        guerreiro.ataque();

    }
}
