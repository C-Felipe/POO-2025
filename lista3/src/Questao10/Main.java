package Questao10;

public class Main {
    public static void main(String[] args) {
        Transporte transporteGenerico = new Transporte(50, 80.0, 10.0, 50000.0);
        System.out.println("=== DADOS DO TRANSPORTE ===");
        transporteGenerico.exibirDados();
        System.out.println("Custo para 100 km: R$ " + transporteGenerico.calcularCustoViagem(100.0));
        System.out.println();

        Onibus onibus = new Onibus(60, 90.0, 8.0, 80000.0, 3);
        System.out.println("=== DADOS DO ÔNIBUS ===");
        onibus.exibirDados();
        System.out.println("Custo para 100 km (com desconto): R$ " + onibus.calcularCustoViagem(100.0));
        System.out.println();

        Metro metro = new Metro(1000, 70.0, 15.0, 200000.0, true);
        System.out.println("=== DADOS DO METRÔ ===");
        metro.exibirDados();
        System.out.println("Custo para 100 km (com desconto): R$ " + metro.calcularCustoViagem(100.0));
        System.out.println();
    }
}

