package br.com.exemplo.eleicao.entidades;
import br.com.exemplo.eleicao.entidades.interfaces.Candidato;

/**
 * CLASSE ABSTRATA que serve como molde para todos os políticos.
 * Ela não pode ser instanciada diretamente ("new Politico() dá erro").
 * Ela já implementa o comportamento padrão de um candidato.
 */

public abstract class Politico implements Candidato {

    protected String nome;
    protected Partido partido;
    protected int numeroCandidato;
    protected int totalVotos;

    public Politico(String nome, Partido partido, int numeroCandidato) {
        this.nome = nome;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
        this.totalVotos = 0;
    }

   //Implementação da Interface Candidato;

    @Override
    public int getNumero(){
        return this.numeroCandidato;
    }

    @Override
    public void receberVoto(){
        this.totalVotos++;
    }

    @Override
    public int getTotalVotos(){
        return this.totalVotos;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Partido: " + this.partido.getNome() + " (" + this.partido.getSigla() + ")");
        System.out.println("Número: " + this.numeroCandidato);
        //Método que ainda não existe;
        System.out.println("Cargo" + getCargo());
    }

    //Método que as classes filhas serão forçadas a criar;
    public abstract String getCargo();

}
