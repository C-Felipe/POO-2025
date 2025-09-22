import java.util.Scanner;

public class Questao12 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        int n, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        while(true){
            System.out.print("Digite um numero positivo ou negativo para sair: ");
            n = scanner.nextInt();

            if(n < 0){
                System.out.println("Saindo...");
                break;
            }

            if(n < menor){
                menor = n;
            } else if(n > maior){
                maior = n;
            }

        }
        System.out.printf("\nMenor número: %d\n", menor);
        System.out.printf("\nMaior número: %d\n", maior);

        scanner.close();
    }
}

