public class Questao13 {
    public void run() {
        for (int i = 1; i <= 100; i++){
            if(i % 10 == 0){
                System.out.printf("%d é múltiplo de 10!\n", i);
            } else {
                System.out.printf("%d\n", i);
            }
        }
    }
}
