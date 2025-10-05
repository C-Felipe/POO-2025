package Questao9;

public class LivroRaro extends Livro {
    private boolean edicaoLimitada; // true se for edição limitada

    public LivroRaro(String titulo, String autor, int anoPublicacao, double preco, boolean edicaoLimitada) {
        super(titulo, autor, anoPublicacao, preco);
        this.edicaoLimitada = edicaoLimitada;
    }

    @Override
    public double calcularMultaAtraso() {
        return 5.0;
    }

    @Override
    public void exibirFichaCatalografica() {
        super.exibirFichaCatalografica();
        System.out.println("Edição limitada: " + (edicaoLimitada ? "Sim" : "Não"));
    }
}