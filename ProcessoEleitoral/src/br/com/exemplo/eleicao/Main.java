package br.com.exemplo.eleicao;

import br.com.exemplo.eleicao.entidades.*;
import br.com.exemplo.eleicao.entidades.sistema.UrnaEletronica;

public class Main {
    public static void main(String[] args) {
        UrnaEletronica urna = new UrnaEletronica();

        Partido pt = new Partido("Partido dos Trabalhadores", "PT");
        Partido psdb = new Partido("Partido da Social Democracia Brasileira", "PSDB");
        Partido pmdb = new Partido("Partido do Movimento Democrático Brasileiro", "PMDB");

        Prefeito prefeito1 = new Prefeito("João Silva", pt, 10);
        Prefeito prefeito2 = new Prefeito("Maria Santos", psdb, 20);
        Vereador vereador1 = new Vereador("Carlos Oliveira", pt, 100);
        Vereador vereador2 = new Vereador("Ana Pereira", psdb, 200);
        Vereador vereador3 = new Vereador("Pedro Costa", pmdb, 300);

        urna.registrarCandidato(prefeito1);
        urna.registrarCandidato(prefeito2);
        urna.registrarCandidato(vereador1);
        urna.registrarCandidato(vereador2);
        urna.registrarCandidato(vereador3);

        Eleitor eleitor1 = new Eleitor("José da Silva");
        Eleitor eleitor2 = new Eleitor("Maria Oliveira");
        Eleitor eleitor3 = new Eleitor("Carlos Pereira");
        Eleitor eleitor4 = new Eleitor("Ana Costa");
        Eleitor eleitor5 = new Eleitor("Pedro Santos");

        urna.receberVoto(new Voto(eleitor1, 10)); // Voto para prefeito1
        urna.receberVoto(new Voto(eleitor2, 20)); // Voto para prefeito2
        urna.receberVoto(new Voto(eleitor3, 100)); // Voto para vereador1
        urna.receberVoto(new Voto(eleitor4, 200)); // Voto para vereador2
        urna.receberVoto(new Voto(eleitor5, 300)); // Voto para vereador3
        // Voto nulo (número inexistente)
        urna.receberVoto(new Voto(new Eleitor("João Nulo"), 999));

        urna.exibirResultados();
    }
}
