import java.util.Scanner;

public class Questao26 {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três lados do triângulo:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (!trianguloValido(a, b, c)) {
            System.out.println("Os lados informados não formam um triângulo válido!");
        } else if (equilatero(a, b, c)) {
            System.out.println("Triângulo Equilátero");
        } else if (isosceles(a, b, c)) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

        scanner.close();
    }

    public static boolean equilatero(int a, int b, int c) {
        return a == b && b == c;
    }

    public static boolean isosceles(int a, int b, int c) {
        return (a == b && a != c) || (a == c && a != b) || (b == c && b != a);
    }

    public static boolean trianguloValido(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

}
