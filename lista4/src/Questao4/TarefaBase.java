package Questao4;

public abstract class TarefaBase {
    protected boolean concluida = false;

    public void marcarConcluido(){
        this.concluida = true;
        System.out.println("Tarefa marcada como concluída.");
    }
}
