package Questao4;

public class TarefaLonga extends TarefaBase implements IExecutavel{

    @Override
    public void executar() {
        int progresso = 0;
        while(progresso < 100){
            progresso++;
            System.out.println("Progresso: " + progresso + "%");
        }
        marcarConcluido();
    }
}
