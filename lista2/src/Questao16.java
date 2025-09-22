import java.util.Scanner;

public class Questao16 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de elementos do vetor: ");
        int n = scanner.nextInt();

        int[] numeros  = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número da sequência: ", i+1);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nSequência inversa:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
            }

    }
}
