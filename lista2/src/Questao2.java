import java.util.Scanner;

public class Questao2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, opcao;

        System.out.println("Digite o primeiro número inteiro: ");
        n1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        n2 = scanner.nextInt();

        System.out.print("""
                Digite a opção desejada: 
                1 - Verificar se um dos números lidos é ou não múltiplo do outro
                2 - Verificar se os dois números lidos são pares
                3 - Verificar se a média dos dois números é maior ou igual a 7
                4 - Sair
                """);
        opcao = scanner.nextInt();

        if(opcao <= 3 ) {
            switch (opcao) {
                case 1:
                    if (n1 % n2 == 0 || n2 % n1 == 0) {
                        System.out.println("Um dos números é múltiplo do outro!");
                    } else {
                        System.out.println("Nenhum dos números é múltiplo do outro!");
                    }
                    break;
                case 2:
                    if (n1 % 2 == 0 && n2 % 2 == 0) {
                        System.out.println("Os dois números são pares!");
                    } else {
                        System.out.println("Não são pares!");
                    }
                    break;
                case 3:
                    double media = (n1 + n2) / 2;
                    if (media >= 7) {
                        System.out.println("A média é maior ou igual a 7!");
                    } else {
                        System.out.println("A média não é maior ou igual a 7!");
                    }
                    break;
            }
        }else {
            System.out.println("Saindo do programa...");
        }
    scanner.close();
    }
}
