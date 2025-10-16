package Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Impressão de Fatura ===");
        System.out.println("Digite o número de cópias para imprimir (digite -1 para sair):");

        int copias;
        do {
            System.out.print("Número de cópias: ");
            copias = scanner.nextInt();

            if (copias == -1) {
                System.out.println("Saindo do sistema.");
                break;
            }

            if (copias <= 0) {
                System.out.println("Número de cópias deve ser maior que 0. Tente novamente.");
                continue;
            }

            fatura.imprimir(copias);

            System.out.println();
            System.out.println("Digite o próximo número de cópias (-1 para sair):");

        } while (true);

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}