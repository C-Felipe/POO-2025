import java.util.Scanner;

public class Questao23 {

    public static double reajuste(double salario, double indice) {
        return salario * (1 + indice / 100);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o índice de reajuste em %: ");
        double indice = scanner.nextDouble();

        double salarioAtualizado = reajuste(salario, indice);

        System.out.printf("Salário atualizado: R$ %.2f\n", salarioAtualizado);

        scanner.close();
    }
}
