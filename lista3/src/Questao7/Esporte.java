package Questao7;

public class Esporte {
    protected String nome;
    protected int numeroJogadores;
    protected int duracaoPartida;
    protected int popularidade;

    public Esporte(String nome, int numeroJogadores, int duracaoPartida,  int popularidade) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }

    public double calcularCustoEquipamento(){
        return 500.00;
    }

    public void exibirRegras(){
        System.out.println("Nome do esporte: " + nome);
        System.out.println("Numero de Jogadores: " + numeroJogadores);
        System.out.println("Duracao partida: " + duracaoPartida + " Minutos");
        System.out.println("Popularidade: " + popularidade);
        System.out.println("Custo do equipamento: R$ " + calcularCustoEquipamento());
    }
}
