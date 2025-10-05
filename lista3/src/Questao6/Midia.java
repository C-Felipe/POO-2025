package Questao6;

public class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected int duracao;
    protected double preco;

    public Midia(String titulo, int anoLancamento, int duracao, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }

    public double calcularPrecoAluguel() {
        return 0.10 * preco;
    }

    public void exibirInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano Lancamento: " + anoLancamento);
        System.out.println("Duracao: " + duracao + " Minutos");
        System.out.println("Preço: R$ " + preco);
        System.out.printf("Preço de Alguel: R$ %.2f\n", calcularPrecoAluguel());
    }

}
