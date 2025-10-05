package Questao4;

public class Main {
    public static void main(String[] args) {
        Imovel imovelGenerico = new Imovel("Rua A, 123", 100.0, 3, 200000.0);
        System.out.println("=== CARACTERÍSTICAS DO IMÓVEL ===");
        imovelGenerico.exibirCaracteristicas();
        System.out.println();

        Apartamento apartamento = new Apartamento("Av. B, 456", 80.0, 2, 150000.0, 5, 500.0);
        System.out.println("=== CARACTERÍSTICAS DO APARTAMENTO ===");
        apartamento.exibirCaracteristicas();
        System.out.println();

        Casa casa = new Casa("Rua C, 789", 150.0, 4, 300000.0, 50.0, true);
        System.out.println("=== CARACTERÍSTICAS DA CASA ===");
        casa.exibirCaracteristicas();
        System.out.println();

        }
    }
