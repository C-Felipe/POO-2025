package Questao8;
import java.util.List;
import java.util.ArrayList;

public class PratoGourmet extends Prato {
    private String chefResponsavel;

    public PratoGourmet(String nome, double preco, int tempoPreparo, List<String> ingredientes, String chefResponsavel) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.chefResponsavel = chefResponsavel;
    }

    @Override
    public double calcularTaxaServico() {
        return 0.15 * preco;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Chef responsável: " + chefResponsavel);
        System.out.println("Taxa de serviço (Gourmet): R$ " + calcularTaxaServico());
    }
}
