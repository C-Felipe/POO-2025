package Questao8;
import java.util.List;
import java.util.ArrayList;


public class Prato {
    protected String nome;
    protected double preco;
    protected int tempoPreparo; // em minutos
    protected List<String> ingredientes;


    public Prato(String nome, double preco, int tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = new ArrayList<>(ingredientes); // Cópia para evitar modificações externas
    }

    public double calcularTaxaServico() {
        return 0.10 * preco;
    }

    public void exibirCardapio() {
        System.out.println("Nome do prato: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Tempo de preparo: " + tempoPreparo + " minutos");
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Taxa de serviço: R$ " + calcularTaxaServico());
    }

    public double getPreco() {
        return preco;
    }
}