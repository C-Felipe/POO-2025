package Questao9;

public class Main {

    public static void main(String[] args) {
        ProdutoAlimenticio feijao = new ProdutoAlimenticio(20);

        feijao.verificarDisponibilidade(10);

        feijao.verificarDisponibilidade(20);

        feijao.verificarDisponibilidade(25);
    }
}
