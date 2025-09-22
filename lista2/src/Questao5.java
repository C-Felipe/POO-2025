import java.util.Scanner;

public class Questao5 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja processar: ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++){
            System.out.printf("Digite o %dº número: ", i);
            int n = scanner.nextInt();

            long fat = 1;
            for (int j = 1; j <= n; j++){
                fat *= j;
            }
            System.out.printf("O fatorial de %d é: %d\n", n, fat);
        }
    }
}
