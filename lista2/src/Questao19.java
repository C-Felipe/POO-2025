import java.util.Scanner;

public class Questao19 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        String[] nome = new String[20];
        int[] idade = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite o nome da %dª candidata: ", i+1);
            nome[i] = scanner.next();
            do {
                System.out.printf("Digite a idade da %dª candidata: ", i+1);
                idade[i] = scanner.nextInt();
                if (idade[i] < 0) {
                    System.out.println("Idade inválida!");
                }
            }while (idade[i] < 0);
        }

        System.out.println("Candidatas aptas: ");
        for (int i = 0; i < 20; i++) {
            if (idade[i] >= 18 && idade[i] <= 20) {
                System.out.println(nome[i]);
            }
        }
    scanner.close();

    }
}
