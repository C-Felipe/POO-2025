package Questao3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IProcessadorDeDados> processadores = new ArrayList<>();
        processadores.add(new ProcessadorCSV());

        String[] dadosExemplo = {"Novo dado 1", "Novo dado 2", "Novo dado 3", "Outro dado"};

        if (!processadores.isEmpty()) {
            IProcessadorDeDados processador = processadores.get(0);
            processador.processar(dadosExemplo);
        }
    }
}