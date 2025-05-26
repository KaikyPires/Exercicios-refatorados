package Exercicios.Energia;

public class dispositivo implements consumo {
    private String nome;
    private int consumosPorHora;
    private int horasDeUso;

    public dispositivo(String nome, int consumosPorHora, int horasDeUso){
        this.nome = nome;
        this.consumosPorHora = consumosPorHora;
        this.horasDeUso = horasDeUso;
    }

    @Override
    public int caulcularConsumo() {
       return consumosPorHora * horasDeUso;
    }

    @Override
    public String getNome() {
       return nome;
    }
}
