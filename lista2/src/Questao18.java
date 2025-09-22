import java.util.Scanner;

public class Questao18 {
    public void run() {
        Scanner scanner =  new Scanner(System.in);

        int maiores = 0, menores = 0, iguais = 0;

        int[] vetor = new int[10];

        System.out.println("Digite os elementos do vetor (inteiros e maiores que zero!): ");
        for (int i = 0; i < 10; i++) {
            int num;
            do {
                System.out.printf("Digite o %dº elemento: ", i+1);
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Valor inválido! Digite apenas números maiores que zero.");
                }
            } while (num <= 0);
            vetor[i] = num;
        }
        int x;
        do {
            System.out.println("Digite um número X (Inteiro e maior que zero!): ");
            x = scanner.nextInt();
            if (x <= 0) {
                System.out.println("Valor inválido! Digite apenas números maiores que zero.");
            }
        }while (x <= 0);

        for (int i = 0; i < 10; i++) {
            if (vetor[i] > x) {
                maiores++;
            } else if (vetor[i] < x) {
                menores++;
            } if (vetor[i] == x) {
                iguais++;
            }
        }

        System.out.println("Números no vetor: ");
        System.out.println("Maiores: " + maiores);
        System.out.println("Menores: " + menores);
        System.out.println("Iguais: " + iguais);

        scanner.close();
    }
}
