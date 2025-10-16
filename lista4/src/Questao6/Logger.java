package Questao6;

public class Logger implements ISalvavelEmArquivo,  ISalvavelEmDB {

    @Override
    public void salvarLocal(String log) {
        if (log != null && !log.isEmpty()) {
            System.out.println("LOG DO ARQUIVO: " + log);
        } else {
            System.out.println("Log vazio, nada para salvar.");
        }
    }

    @Override
    public void salvarRemoto(String log) {
        for (int i = 1; i <= 3; i++){
            System.out.println("Tentativa " + i + " de conexão com DB.");
        }
        System.out.println("LOG DB: " + log);
    }
}
