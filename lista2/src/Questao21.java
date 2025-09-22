import java.util.Scanner;
import java.util.Random;

public class Questao21 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(101);
        int tentativas = 0;
        int palpite;

        System.out.println("Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número de 0 a 100");

        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número " + numeroSorteado + ".");
                System.out.println("Número de tentativas: " + tentativas);
                break;
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor que " + palpite + ".");
            } else {
                System.out.println("O número sorteado é maior que " + palpite + ".");
            }
        }

        scanner.close();
    }
}
