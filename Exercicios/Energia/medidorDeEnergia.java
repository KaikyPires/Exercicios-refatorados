package Exercicios.Energia;

public class medidorDeEnergia {
    public static final int LIMITE_MAXIMO_DE_CONSUMO =5000;

    public static int limitarConsumo(int consumo){
        return Math.min(consumo, LIMITE_MAXIMO_DE_CONSUMO);

    }
    public static int calculoFinalDeConsumo(consumo[] dispositivos){
        int consumoFinal = 0;

        for(consumo verificador : dispositivos){
            consumoFinal += verificador.caulcularConsumo();
        }
        return limitarConsumo(consumoFinal);
    }
    public static void main(String[] args) {
        consumo[] dispositivos = {
            new dispositivo("TV", 150, 4),
            new dispositivo("Geladeira", 100, 24),
            new dispositivo("PC", 300, 5)
        };

        int consumoFinal = calculoFinalDeConsumo(dispositivos);
        System.out.println("Consumo total: " + consumoFinal + "W");
    }

}
