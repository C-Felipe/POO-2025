import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da questão que deseja executar (1 a 26): ");
        int questao = scanner.nextInt();

        switch (questao) {
            case 1:
                Questao1 q1 = new Questao1();
                q1.run();
                break;
            case 2:
                Questao2 q2 = new Questao2();
                q2.run();
                break;
            case 3:
                Questao3 q3 = new Questao3();
                q3.run();
                break;
            case 4:
                Questao4 q4 = new Questao4();
                q4.run();
                break;
            case 5:
                Questao5 q5 = new Questao5();
                q5.run();
                break;
            case 6:
                Questao6 q6 = new Questao6();
                q6.run();
                break;
            case 7:
                Questao7 q7 = new Questao7();
                q7.run();
                break;
            case 8:
                Questao8 q8 = new Questao8();
                q8.run();
                break;
            case 9:
                Questao9 q9 = new Questao9();
                q9.run();
                break;
            case 10:
                Questao10 q10 = new Questao10();
                q10.run();
                break;
            case 11:
                Questao11 q11 = new Questao11();
                q11.run();
                break;
            case 12:
                Questao12 q12 = new Questao12();
                q12.run();
                break;
            case 13:
                Questao13 q13 = new Questao13();
                q13.run();
                break;
            case 14:
                Questao14 q14 = new Questao14();
                q14.run();
                break;
            case 15:
                Questao15 q15 = new Questao15();
                q15.run();
                break;
            case 16:
                Questao16 q16 = new Questao16();
                q16.run();
                break;
            case 17:
                Questao17 q17 = new Questao17();
                q17.run();
                break;
            case 18:
                Questao18 q18 = new Questao18();
                q18.run();
                break;
            case 19:
                Questao19 q19 = new Questao19();
                q19.run();
                break;
            case 20:
                Questao20 q20 = new Questao20();
                q20.run();
                break;
            case 21:
                Questao21 q21 = new Questao21();
                q21.run();
                break;
            case 22:
                Questao22 q22 = new Questao22();
                q22.run();
                break;
            case 23:
                Questao23 q23 = new Questao23();
                q23.run();
                break;
            case 24:
                Questao24 q24 = new Questao24();
                q24.run();
                break;
            case 25:
                Questao25 q25 = new Questao25();
                q25.run();
                break;
            case 26:
                Questao26 q26 = new Questao26();
                q26.run();
                break;
            default:
                System.out.println("Questão inválida!");
        }

        scanner.close();
    }
}
