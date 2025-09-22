import java.util.Scanner;

public class Questao22 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro caractere de A a Z: ");
        char c1 = scanner.next().charAt(0);

        System.out.print("Digite o segundo caractere de A a Z: ");
        char c2 = scanner.next().charAt(0);

        if (c1 > c2) {
            System.out.println("Erro: Os caracteres não estão em ordem alfabética.");
        } else {
            int numeroEntre = c2 - c1 - 1;
            System.out.println("Número de caracteres entre '" + c1 + "' e '" + c2 + "': " + numeroEntre);
        }

        scanner.close();
    }
}
