package Questao9;

public abstract class Produto {
    protected int quantidadeEstoque;

    public abstract void verificarDisponibilidade(int quantidadeSolicitada);
}
