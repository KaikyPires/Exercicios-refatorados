package Jogo;
import Ataque.AtaqueEspada;
import Ataque.AtaqueMagia;
import Defesa.DefesaEscudo;
import Personagem.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem("Guerreiro", new AtaqueEspada(), new DefesaEscudo());
        guerreiro.ataque();
        guerreiro.defesa();

        guerreiro.setEstrategiaDeAtaque(new AtaqueMagia());
        guerreiro.ataque();

    }
}
