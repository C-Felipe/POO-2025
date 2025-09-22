import java.util.Scanner;

public class Questao11 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        int matricula, qtdAluno = 0;
        double nota, media, somaNotas = 0;

        System.out.println("Digite os dados do aluno ou digite 0 para sair: ");

        while(true){
            System.out.println("Digite a matrícula do aluno:");
            matricula = scanner.nextInt();

            if(matricula == 0){
                System.out.println("Saindo... ");
                break;
            }

            System.out.println("Digite a nota do aluno: ");
            nota = scanner.nextDouble();

            somaNotas += nota;
            qtdAluno++;
            }

        if (qtdAluno > 0){
            media = somaNotas / qtdAluno;
            System.out.printf("Média dos alunos: %.2f\n", media);
        } else {
            System.out.println("Nenhum aluno cadastrado!");
        }
    scanner.close();
    }
}
