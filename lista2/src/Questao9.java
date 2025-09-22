import java.util.Scanner;

public class Questao9 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        int n, somaPar = 0, somaImpar = 0;

        while (true){
            System.out.println("Digite um número positivo (ou negativo para sair) ");
            n =  scanner.nextInt();

            if ( n < 0){
                System.out.println("Número negativo, fim do conjunto!");
                break;
            }

            if ( n % 2 == 0 ){
                System.out.printf("%d é par!\n", n);
                somaPar += n;
            } else {
                System.out.printf("%d é impar!\n", n);
                somaImpar += n;
            }
        }

        System.out.printf("\nSoma dos números pares: %d\n", somaPar);
        System.out.printf("\nSoma dos números impares: %d\n", somaImpar);
    }
}
