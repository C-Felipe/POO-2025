package Questao5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValidadorSeguranca validador = new ValidadorSeguranca();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira a senha:");
        String senha = scanner.nextLine();

        validador.validarAcesso(senha);
    }
}
