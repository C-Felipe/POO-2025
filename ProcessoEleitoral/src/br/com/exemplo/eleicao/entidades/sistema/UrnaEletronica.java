package br.com.exemplo.eleicao.entidades.sistema;

import br.com.exemplo.eleicao.entidades.Voto;
import br.com.exemplo.eleicao.entidades.interfaces.Candidato;
import java.util.ArrayList;
import java.util.List;

public class UrnaEletronica {
    // Lista de candidatos usando interface para flexibilidade;
    private List<Candidato> candidatosRegistrados;

    //Lista de votos computados;
    private List<Voto> votosComputados;

    public UrnaEletronica() {
        this.candidatosRegistrados = new ArrayList<>();
        this.votosComputados = new ArrayList<>();
    }

    public void registrarCandidato(Candidato novoCandidato) {
        //Verificando se o número do novoCandidato ja existe na lista;
        for  (Candidato candidato : candidatosRegistrados) {
            if (candidato.getNumero() == novoCandidato.getNumero()) {
                System.out.println("Erro: Candidato com número " + novoCandidato.getNumero() + " já registrado.");
                return;
            }
        }

        //Se não existir, adiciona o novoCadidato a lista;
        candidatosRegistrados.add(novoCandidato);
        System.out.println("Candidato registrado com sucesso: " + novoCandidato.getNumero());
    }

    public void registrarVoto(Voto voto) {
        int numeroVotado = voto.getNumeroCandidatoVotado();
        Candidato candidatoEncontrado = null;
        //Percorrendo a lista de canditadosRegistrados;
        for (Candidato candidato : candidatosRegistrados) {
            if (candidato.getNumero() == numeroVotado) {
                candidatoEncontrado = candidato;
                break;
            }
        }
        if (candidatoEncontrado != null) {
            //Chama o método se o candidato for encontrado;
            candidatoEncontrado.receberVoto();
            //Adiciona o voto a lista votosComputados;
            votosComputados.add(voto);
            System.out.println("Voto para o número " + numeroVotado + " confirmado!");
        } else {
            System.out.println("Voto nulo (candidato " + numeroVotado + " não encontrado).");
        }
    }

    //Exibindo os resultados;
    public void exibirResultados(){
        System.out.println("=== RESULTADOS DA ELEIÇÃO ===");
        for (Candidato candidato : candidatosRegistrados) {
            candidato.exibirDados();
            System.out.println("Total de Votos: " + candidato.getTotalVotos());
            System.out.println("-----------------------------");
        }
    }

    public List<Candidato> getCandidatosRegistrados() {
        return this.candidatosRegistrados;
    }
}
