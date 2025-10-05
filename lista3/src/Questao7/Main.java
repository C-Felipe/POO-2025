package Questao7;


public class Main {
    public static void main(String[] args) {
        Esporte esporteGenerico = new Esporte("Esporte", 10, 60, 5);
        System.out.println("=== REGRAS DO ESPORTE ===");
        esporteGenerico.exibirRegras();
        System.out.println("\n");

        // Criando um futebol
        Futebol futebol = new Futebol("Futebol", 22, 90, 10, 105.0);
        System.out.println("=== REGRAS DO FUTEBOL ===");
        futebol.exibirRegras();
        System.out.println("\n");

        // Criando um basquete
        Basquete basquete = new Basquete("Basquete", 10, 48, 8, 3.05);
        System.out.println("=== REGRAS DO BASQUETE ===");
        basquete.exibirRegras();
        System.out.println("\n");
    }
}
