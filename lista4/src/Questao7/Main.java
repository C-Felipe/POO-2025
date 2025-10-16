package Questao7;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        Carro carro = new Carro(cor, modelo);

        System.out.println("\nDetalhes do veículo");
        carro.exibirDetalhes();
    }
}
