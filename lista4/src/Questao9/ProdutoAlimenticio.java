package Questao9;

public class ProdutoAlimenticio extends Produto {

    public ProdutoAlimenticio(int estoqueInicial) {
        this.quantidadeEstoque = estoqueInicial;
        System.out.println("Novo produto alimentício criado com " + estoqueInicial + " unidades em estoque.");
    }

    @Override
    public void verificarDisponibilidade(int quantidadeSolicitada) {
        System.out.println("\nTentando solicitar " + quantidadeSolicitada + " unidades...");

        if (quantidadeSolicitada > this.quantidadeEstoque) {
            System.out.println("Resultado: Estoque Insuficiente!");
        } else if (quantidadeSolicitada == this.quantidadeEstoque) {
            System.out.println("Resultado: Últimas Unidades!");
        } else {
            System.out.println("Resultado: Disponibilidade OK.");
        }
    }
}
