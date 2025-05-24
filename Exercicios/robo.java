package Exercicios;

public class robo {
    public static final int CARGA_MAXIMA = 100, CARGA_INICIAL = 100;
    public static final int CARGA_MINIMA = 0;

    public static int verificadorDeCarga(int carga){
        if(carga > CARGA_MAXIMA){
            return CARGA_MAXIMA;
        }
        if(carga < CARGA_MINIMA){
            return CARGA_MINIMA;
        }
        return carga;
    }

    public static int cargaRobo (int[] carga){
        int cargaTotal = CARGA_INICIAL;

        for(int variacao : carga){
            cargaTotal = verificadorDeCarga(cargaTotal + variacao);
            System.out.println(cargaTotal);
        }
        return cargaTotal;
    }
    public static void main(String[] args) {
        int[] variacoesDeCarga = {-30, -50, +20, -10};

        int cargaTotal = cargaRobo(variacoesDeCarga);
        System.out.println("Carga final da bateria: " + cargaTotal+ "%");
    }
}
