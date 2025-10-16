package Questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do desenvolvedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o código do cargo (1 para Júnior, 2 para Pleno, 3 para Sênior): ");
        int codigoCargo = scanner.nextInt();

        System.out.println("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        Desenvolvedor desenvolvedor = new Desenvolvedor(nome, codigoCargo, salarioBase);

        double bonificacao = desenvolvedor.calcularBonificacao();

        System.out.println("O bônus calculado para " + nome + " é: " + bonificacao);

        scanner.close();
    }
}