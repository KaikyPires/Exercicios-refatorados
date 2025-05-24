package Exercicios;

public class dadosDoCelular {
    public static final int LIMITE_MAX_DE_DADOS_DISPONIVEIS = 2000;
    public static final int LIMITE_MIN_DE_DADOS_DISPONIVEIS = 0;

    public static int verificadorDeDados(int consumo){
       
        if(consumo >= LIMITE_MAX_DE_DADOS_DISPONIVEIS){
        return LIMITE_MAX_DE_DADOS_DISPONIVEIS;
        }
        if(consumo <= LIMITE_MIN_DE_DADOS_DISPONIVEIS){
        return LIMITE_MIN_DE_DADOS_DISPONIVEIS;
        }
         return consumo;
    }

    public static int usoDeDados (int[] dados){
        int consumoAtual = 0;

        for(int consumo : dados){
            consumoAtual += consumo;
            consumoAtual = verificadorDeDados(consumoAtual);
           
        }
        return consumoAtual;
    }
    public static void main(String[] args) {
        int[] variacaoDeConsumo = {150, 300, 500, 800};
        int dadosFinais = usoDeDados(variacaoDeConsumo);

        System.out.println(dadosFinais);
    }

}
