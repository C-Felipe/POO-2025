package Questao5;

public class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected int voltagem;

    public ProdutoEletronico(String marca, String modelo, double preco, int voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida(){
        return 0.15 * preco;
    }

    public void exibirEspecificacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco: R$" + preco);
        System.out.println("Voltagem: " + voltagem);
        System.out.println("Valor garantia estendida: R$" + calcularGarantiaEstendida());
    }
}
