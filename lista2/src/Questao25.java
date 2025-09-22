import java.util.Scanner;

public class Questao25 {

    public static void carregarVetor(int[] vetor, Scanner sc) {
        System.out.println("Carregando o vetor (10 elementos):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento na posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor carregado com sucesso!");
    }

    public static void listarVetor(int[] vetor) {
        System.out.println("Vetor completo:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void listarPares(int[] vetor) {
        System.out.println("Números pares do vetor:");
        boolean temPares = false;
        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                temPares = true;
            }
        }
        if (!temPares) {
            System.out.println("Nenhum número par encontrado.");
        } else {
            System.out.println();
        }
    }

    public static void listarImpares(int[] vetor) {
        System.out.println("Números ímpares do vetor:");
        boolean temImpares = false;
        for (int num : vetor) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                temImpares = true;
            }
        }
        if (!temImpares) {
            System.out.println("Nenhum número ímpar encontrado.");
        } else {
            System.out.println();
        }
    }

    public static int contarParesEmPosicoesImpares(int[] vetor) {
        int count = 0;
        for (int i = 1; i < vetor.length; i += 2) { // Posições ímpares: 1,3,5,...
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int contarImparesEmPosicoesPares(int[] vetor) {
        int count = 0;
        for (int i = 0; i < vetor.length; i += 2) { // Posições pares: 0,2,4,...
            if (vetor[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int opcao;

        do {
            System.out.println("\nOpções Disponíveis:");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir apenas os números pares do vetor");
            System.out.println("4 - Exibir apenas os números ímpares do vetor");
            System.out.println("5 - Exibir a quantidade de números pares em posições ímpares do vetor");
            System.out.println("6 - Exibir a quantidade de números ímpares em posições pares do vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carregarVetor(vetor, scanner);
                    break;
                case 2:
                    listarVetor(vetor);
                    break;
                case 3:
                    listarPares(vetor);
                    break;
                case 4:
                    listarImpares(vetor);
                    break;
                case 5:
                    int paresEmImpares = contarParesEmPosicoesImpares(vetor);
                    System.out.println("Quantidade de números pares em posições ímpares: " + paresEmImpares);
                    break;
                case 6:
                    int imparesEmPares = contarImparesEmPosicoesPares(vetor);
                    System.out.println("Quantidade de números ímpares em posições pares: " + imparesEmPares);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
