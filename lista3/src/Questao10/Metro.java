package Questao10;

public class Metro extends Transporte {
    private boolean eletrico;

    public Metro(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, boolean eletrico) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.eletrico = eletrico;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custoBase = super.calcularCustoViagem(distancia);
        return custoBase * 0.70;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Elétrico: " + (eletrico ? "Sim" : "Não"));
    }
}