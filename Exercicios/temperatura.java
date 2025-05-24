package Exercicios;
public class temperatura {
    public static final int temperaturaMaximaConfortavel = 25;
    public static final int temperaturaMinimaConfortavel = 20;

    public static boolean varificadorDeTemperatura(int temperatura){
        return temperatura >= temperaturaMinimaConfortavel && temperatura <= temperaturaMaximaConfortavel;
    }

    public static int contarTemperaturasConfortaveis(int[] leituras){
        int total = 0;
        for(int temperatura : leituras){
            if(varificadorDeTemperatura(temperatura)){
                total++;
            }
        }
        return total;
    }
        public static void main(String[] args) {
            int[] leituras = {18,29,23,25};

            int totalConfortaveis = contarTemperaturasConfortaveis(leituras);

            System.out.println("Total de temperaturas confortáveis: " + totalConfortaveis);

    }
}
