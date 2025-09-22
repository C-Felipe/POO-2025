import java.util.Scanner;

public class Questao8 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        int resultado;

        System.out.printf("\n*** TABUADA DE %d ***\n\n", n);

        for (int i = 1; i <= 10; i++){
            resultado = n * i;
            System.out.printf("%d * %d = %d\n",n, i, resultado);
        }
    }
}
