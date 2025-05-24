package Exercicios;
public class bateria {

    private static final int cargaInicial = 50;
    public static final int cargaMaxima = 100;
    public static final int cargaMinima = 0;

    private static int ajustarCarga(int carga){

        if(carga > cargaMaxima){
            return cargaMaxima;
        }
        if(carga < cargaMinima){
            return cargaMinima;
        }
        return carga;
    }

    public static int getBattery(int[] eventos){
        int cargaAtual = cargaInicial;

        for(int variacao : eventos){
            cargaAtual = ajustarCarga(cargaAtual + variacao);

        }
        return cargaAtual;
    }

     public static void main(String[] args) {
        int[] variacoesCarga = {10, -20, 61, -15};
        int cargaFinal = getBattery(variacoesCarga);
        System.out.println("Bateria final: " + cargaFinal + "%");
    }

}