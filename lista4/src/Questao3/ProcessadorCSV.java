package Questao3;

public class ProcessadorCSV implements IProcessadorDeDados {
    @Override
    public void processar(String[] dados) {
        for(int i = 0; i < dados.length; i++){
            System.out.println(i + ": " + dados[i]);
        }
    }
}
