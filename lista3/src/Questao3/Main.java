package Questao3;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Introdução à Lógica de Programação", 40, 500.0, "Básico");
        curso1.exibirInformacoes();
        System.out.println();

        CursoPresencial curso2 = new CursoPresencial("Java Avançado", 60, 1200.0, "Avançado", "Pau dos Ferros - RN");
        System.out.println("=== Curso Presencial ===");
        curso2.exibirInformacoes();
        System.out.println();

        CursoOnline curso3 = new CursoOnline("Python para Data Science", 50, 800.0, "Intermediário", "Udemy");
        System.out.println("=== Curso Online ===");
        curso3.exibirInformacoes();
        System.out.println();
    }
}
