package Questao6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma mensagem de log:");
        String log = scanner.nextLine();

        Logger logger = new Logger();

        System.out.println("\nSalvando log local:");
        logger.salvarLocal(log);

        System.out.println("\nSalvando log remoto:");
        logger.salvarRemoto(log);
    }
}