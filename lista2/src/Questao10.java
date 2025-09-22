import java.util.Scanner;

public class Questao10 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo maior que zero e menor que dez: ");
        int n = scanner.nextInt();

        if (n <= 0 || n >= 10) {
            System.out.println("Erro! O número deve ser maior que zero(0) e menor que dez(10).");
            scanner.close();
            return;
        }

        int primeiroImpar = (n % 2 == 1) ? n : n + 1;

        long somaQuadrados = 0;

        for (int i = 0; i < 20; i++) {
            int impar = primeiroImpar + (i * 2);
            somaQuadrados += (long) impar * impar;
        }

        System.out.println("A soma dos quadrados dos 20 primeiros números ímpares a partir de " + n + " é: " + somaQuadrados);

        scanner.close();
    }
}
