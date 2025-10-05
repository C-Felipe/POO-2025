package Questao5;

public class Notebook extends ProdutoEletronico{
    private String processador;
    private int memoriaRam;

    public Notebook(String marca, String modelo, double preco, int voltagem, String processador, int memoriaRam) {
        super(marca, modelo, preco, voltagem);
        this.processador = processador;
        this.memoriaRam = memoriaRam;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return 0.25 * preco;
    }

    @Override
    public void exibirEspecificacoes() {
        super.exibirEspecificacoes();
        System.out.println("Processador: " + processador);
        System.out.println("Memoria RAM: " + memoriaRam);
    }
}
