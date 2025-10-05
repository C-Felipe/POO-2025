package Questao10;

public class Transporte {
    protected int capacidadePassageiros;
    protected double velocidadeMaxima;
    protected double consumo;
    protected double preco;

    public Transporte(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.preco = preco;
    }

    public double calcularCustoViagem(double distancia) {
        return (distancia / consumo) * 5.50;
    }

    public void exibirDados() {
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Consumo: " + consumo + " km/l");
        System.out.println("Preço: R$ " + preco);
    }

    public double getConsumo() {
        return consumo;
    }
}