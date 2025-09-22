import java.util.Scanner;

public class Questao3 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double h = scanner.nextDouble();

        System.out.print("""
                Digite seu sexo: 
                1 - Para masculino
                2 - Para feminino
                """);
        int  sexo = scanner.nextInt();

        double p;

        if (sexo <= 2){
            switch (sexo){
                case 1:
                    p = (72.7 * h) - 58;
                    System.out.printf("Peso ideal: %.2fKgs\n", p);
                    break;
                case 2:
                    p = (62.1 * h) - 44;
                    System.out.printf("Peso ideal: %.2fKgsz\n", p);
            }
        } else {
            System.out.println("Sexo inválido!");
        }
    }
}
