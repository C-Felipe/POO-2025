import java.util.Scanner;

public class Questao14 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        int n, menor =  Integer.MAX_VALUE, maior = Integer.MIN_VALUE, somaNumero = 0;
        double media;

        System.out.println("Digite 10 valores inteiros e positivos\n");

        for (int i = 1; i <= 10; i++) {
            do {
                System.out.printf("Digite o %dº número: ", i);
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Número inválido, apenas números positivos!");
                }
            } while (n < 0);

            if (n < menor) {
                menor = n;
            } else if (n > maior) {
                maior = n;
            }
            somaNumero += n;
        }

        media = somaNumero / 10;

        System.out.printf("Menor número: %d\n", menor);
        System.out.printf("Maior número: %d\n", maior);
        System.out.printf("Média dos números lidos: %.2f\n", media);

        scanner.close();
    }
}
