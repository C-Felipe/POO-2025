package Questao8;
import java.util.List;
import java.util.ArrayList;

public class PratoVegano extends Prato {
    private String certificacaoVegan;

    public PratoVegano(String nome, double preco, int tempoPreparo, List<String> ingredientes, String certificacaoVegan) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.certificacaoVegan = certificacaoVegan;
    }

    @Override
    public double calcularTaxaServico() {
        return 0.05 * preco;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Certificação Vegana: " + certificacaoVegan);
        System.out.println("Taxa de serviço (Vegano): R$ " + calcularTaxaServico());
    }
}
