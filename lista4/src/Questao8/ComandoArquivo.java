package Questao8;

public class ComandoArquivo implements IComando {

    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando o Comando de Arquivo...");
    }
}
