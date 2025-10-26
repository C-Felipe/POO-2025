package br.com.exemplo.eleicao.entidades.interfaces;

/**
 * Interface que define as ações essenciais de um candidato.
 * É como um contrato que obriga qualquer classe que a implemente
 * a ter os métodos abaixo.
 */

public interface Candidato {

    //Método para retornar o número do candidato;
    int getNumero();

    //Método para receber voto;
    void receberVoto();

    //Método para retornar o total de votos;
    int getTotalVotos();

    //Método para exibir dados do candidato;
    void exibirDados();
}
