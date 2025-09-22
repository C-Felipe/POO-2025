import java.util.Scanner;

public class Questao15 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        double indice;
        String resp;

        System.out.println("CONTROLE DO ÍNDICE DE POLUIÇÃO");

        while (true) {
            System.out.println("Digite o índice de poluição: ");
            indice = scanner.nextDouble();

            if (indice == 0.0) {
                System.out.println("Saindo... ");
                break;
            }

            if (indice >= 0.5){
                System.out.println("Todos os grupos devem paralisar suas atividades!!");
            } else if (indice >= 0.4){
                System.out.println("1º e 2º grupos devem suspender suas atividades!!");
            } else if (indice >= 0.3){
                System.out.println("1º grupo deve suspender suas atividades!!");
            } else {
                System.out.println("Índice de poluição aceitavel!");
            }

            System.out.println("Deseja encerrar o programa? (S/N)");
            resp = scanner.next();

            if (resp.equalsIgnoreCase("S")){
                System.out.println("Programa encerrado!");
                break;
            }
        }
        scanner.close();
    }
}
