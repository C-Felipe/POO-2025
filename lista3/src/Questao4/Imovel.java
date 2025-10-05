package Questao4;

public class Imovel {
    protected String endereco;
    protected double area;
    protected int numeroQuartos;
    protected double preco;

    public Imovel(String endereco, double area, int numeroQuartos, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
    }

    public double calcularTaxaAdministracao(){
        return preco * 0.08;
    }

    public void exibirCaracteristicas(){
        System.out.println("Endereço: " + endereco);
        System.out.println("Área: " + area);
        System.out.println("Quantidade de quartos: " + numeroQuartos);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Taxa de adminstração: R$ " + calcularTaxaAdministracao());
    }

    public double getPreco() {
        return preco;
    }

}
