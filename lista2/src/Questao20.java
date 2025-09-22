import java.util.Scanner;

public class Questao20 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("Digite o tamanho dos vetores V1 e V2: ");
            n = scanner.nextInt();

            if (n > 50 || n < 0){
                System.out.println("Quantidade inválida, digite um número de 1 a 50!");
            }
        }while (n > 50 || n < 0);

        int[] v1  = new int[n];
        int[] v2 = new int[n];

        System.out.println("Digite os valores do vetor V1: ");
        for (int i = 0; i < n; i++){
            v1[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetor V2: ");
        for (int i = 0; i < n; i++){
            v2[i] = scanner.nextInt();
        }

        int iguais = 0;
        for (int i = 0; i < n; i++){
            if (v1[i] == v2[i]){
                iguais++;
            }
        }

        System.out.println("Quantidade de valores iguais nos vetores: " + iguais);

        scanner.close();
    }
}

