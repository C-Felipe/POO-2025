package Questao8;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IComando> listaDeComandos = new ArrayList<>();

        System.out.println("Adicionando comandos à lista...");
        listaDeComandos.add(new ComandoRede());
        listaDeComandos.add(new ComandoArquivo());
        System.out.println("Comandos adicionados.");
        System.out.println("------------------------------------");

        System.out.println("Iniciando a execução dos comandos...");
        for (IComando comando : listaDeComandos) {
            comando.executar(null);
        }
        System.out.println("------------------------------------");
        System.out.println("Execução de todos os comandos finalizada.");
    }
}