package Questao5;

public class Smartphone extends ProdutoEletronico{
    private double tamanhoTela;
    private int capacidadeBateria;

    public Smartphone(String marca, String modelo, double preco, int voltagem, double tamanhoTela, int capacidadeBateria) {
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return 0.20 * preco;
    }

    @Override
    public void exibirEspecificacoes(){
        super.exibirEspecificacoes();
        System.out.println("Tamanho Tela: " + tamanhoTela);
        System.out.println("Capacidade Bateria: " + capacidadeBateria);
    }
}
