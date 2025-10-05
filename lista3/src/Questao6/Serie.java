package Questao6;

public class Serie extends Midia {
    private int numeroTemporadas;
    private int episodiosPorTemporada;

    public Serie(String titulo, int anoLancamento, int duracao, double preco, int numeroTemporadas, int episodiosPorTemporada) {
        super(titulo, anoLancamento, duracao, preco);
        this.numeroTemporadas = numeroTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public double calcularPrecoAluguel(){
        return 0.12 * preco;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de Temporadas: " + numeroTemporadas);
        System.out.println("Episodios por Temporada: " + episodiosPorTemporada);
    }
}
