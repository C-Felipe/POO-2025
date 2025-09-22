import java.util.Scanner;

public class Questao17 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de elementos dos vetores X e Y: ");
        int n = scanner.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("Digite os elementos do vetor X: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº elemento: ", i +1);
            x[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor Y: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº elemento: ", i +1);
            y[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < n; i++) {
            produtoEscalar += x[i] * y[i];
        }

        System.out.println("Produto Escalar dos vetores: " + produtoEscalar);

        scanner.close();

    }
}
