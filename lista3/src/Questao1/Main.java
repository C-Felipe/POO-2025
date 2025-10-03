package Questao1;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Nissan", "GTR R35", 2019, 850000);
        System.out.println("Carro:");
        veiculo.exibirDetalhes();
        System.out.println();

        Moto moto = new Moto("Honda", "CB1000", 2021, 25000, 1000);
        System.out.println("Moto:");
        moto.exibirDetalhes();
        System.out.println();

        Caminhao caminhao = new Caminhao("Volvo", "FH", 2019, 150000, 20);
        System.out.println("Caminhão:");
        caminhao.exibirDetalhes();
        System.out.println();
    }
}