import java.util.Scanner;

public class Questao1 {
    public void run() {
        Scanner input = new Scanner(System.in);

    System.out.print("""
        Digite a opção desejada:
        1 - Adição
        2 - Subtracão
        3 - Multiplicação
        4 - Divisão\n""");

    int opcao = input.nextInt();

    double resultado;

    if (opcao >= 1 && opcao <= 4) {
        System.out.println("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = input.nextDouble();

    switch (opcao) {
        case 1:
            resultado = n1 + n2;
            System.out.println("Resultado da adição: " + (int) resultado);
            break;
        case 2:
            resultado = n1 - n2;
            System.out.println("Resultado da subtração: " + (int) resultado);
            break;
        case 3:
            resultado = n1 * n2;
            System.out.println("Resultado da multiplicação: " + (int) resultado);
            break;
        case 4:
            if (n2 != 0) {
                resultado = n1 / n2;
                System.out.println("Resultado da divisão: " + resultado);
            } else {
                System.out.println("Não existe divisão por zero!");
            }
            break;
         }
    }else {
        System.out.println("Opção inválida!");
    }

    input.close();
 }

}
