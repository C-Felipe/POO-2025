package lista1; 

import java.util.Scanner;

public class Lista1java {

//N�vel 1: Entrada, Processamento e Sa�da

    public static void questao1(){

        //Programa para calcular o estoque m�dio de uma pe�a.
       
        Scanner input = new Scanner(System.in);

        int qtdMin, qtdMax, estoqueMed;

        System.out.print("Digite a quantidade m�nima de pe�a: ");
        qtdMin = input.nextInt();

        System.out.print("Digite a quantidade maxima de pe�a: ");
        qtdMax = input.nextInt();

        estoqueMed = (qtdMin + qtdMax) / 2;

        System.out.println("O estoque m�dio da pe�a �: " + estoqueMed);

    }

    public static void questao2(){

        //Programa para Ler a cota��o e um valor em dolares e converter para reais.
       
        Scanner input = new Scanner(System.in);

        double cotDolar, valorDolar, valorReal;

        System.out.print("Digite a cota��o atual do d�lar: ");
        cotDolar = input.nextDouble();

        System.out.print("Digite o valor em d�lares que deseja converter: ");
        valorDolar = input.nextDouble();

        valorReal = valorDolar * cotDolar;

        System.out.printf("O valor em reais �: R$ %.2f\n", valorReal);


    }

    public static void questao3(){

        Scanner input = new Scanner(System.in);

        String vendedor;
        int codPeca, qtd;
        double precoUni, totalVenda, comissao;

        System.out.print("Digite o nome do vendedor: ");
        vendedor = input.nextLine();

        System.out.print("Digite o c�digo da pe�a: ");
        codPeca = input.nextInt();

        System.out.print("Digite o pre�o unit�rio da pe�a: ");
        precoUni = input.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        qtd = input.nextInt();

        totalVenda = precoUni * qtd;

        comissao = totalVenda * 0.05;

        System.out.println("\n");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("C�digo da pe�a: " + codPeca);
        System.out.printf("Pre�o unit�rio: R$ %.2f%n", precoUni);
        System.out.println("Quantidade vendida: " + qtd);
        System.out.printf("Total da venda: R$ %.2f%n", totalVenda);
        System.out.printf("Comiss�o (5%%): R$ %.2f%n", comissao);
        System.out.println("\n");

       
    }

    public static void questao4(){

        Scanner input = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("Digite o valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        B = input.nextInt();

        System.out.print("Digite o valor de C: ");
        C = input.nextInt();
        
        System.out.print("Digite o valor de D: ");
        D = input.nextInt();

        System.out.println("\nRESULTADO DAS SOMAS: ");

        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));

        System.out.println("\nRESULTADO DAS MULTIPLICA��ES: ");

        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));

        System.out.println("");


    }

    public static void questao5(){

        Scanner input = new Scanner(System.in);

        double tempo, velocidade, distancia, litrosUsados;

        System.out.print("Digite o tempo gasto na viagem: ");
        tempo = input.nextDouble();

        System.out.print("Digite a velocidade m�dia: ");
        velocidade = input.nextDouble();

        distancia = tempo * velocidade;

        litrosUsados = distancia / 12;

        //Ajustando tempo para horas:minutos
        int horas = (int) tempo;
        int minutos = (int) Math.round((tempo - horas) * 60);

        if (minutos == 60) {
            horas++;
            minutos = 0;
        }

        System.out.printf("Tempo gasto: %d:%02dHrs%n", horas, minutos);
        System.out.printf("Velocidade m�dia: %.2f km/h%n", velocidade);
        System.out.printf("Dist�ncia percorrida: %.2f km%n", distancia);
        System.out.printf("Combust�vel utilizado: %.2f litros%n", litrosUsados);


    }

    public static void questao6(){

        Scanner input = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em graus Celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A temperatura em Fahrenheit �: %.2f�F%n", fahrenheit);


    }

    public static void questao7(){

        Scanner input = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("A temperatura em Celsius �: %.2f�C%n", celsius);


    }

    public static void questao8(){

        Scanner input = new Scanner(System.in);

        double R, A, V, Vlitros;

        System.out.print("Digite o raio da lata: ");
        R = input.nextDouble();

        System.out.print("Digite a altura da lata: ");
        A = input.nextDouble();

        V = 3.14159 * R * R * A;

        Vlitros = V / 1000;

        System.out.printf("O volume da lata em cm� �: %.2f cm�%n", V);
        System.out.printf("O volume da lata em litros �: %.2f litros%n", Vlitros);

    }

    public static void questao9(){

        Scanner input = new Scanner(System.in);

        int anos, meses, dias, totalDias;

        System.out.print("Digite sua idade em anos: ");
        anos = input.nextInt();

        System.out.print("Digite os meses adicionais: ");
        meses = input.nextInt();

        System.out.print("Digite os dias adicionais: ");
        dias = input.nextInt();

        totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("A idade total em dias �: " + totalDias + " dias");

    }

    public static void questao10(){

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro n�mero: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        num2 = input.nextInt();

        System.out.println("\n===== RELACIONAMENTOS =====");

        if (num1 == num2) {
            System.out.printf("%d � igual a %d%n", num1, num2);
        } else {
            System.out.printf("%d n�o � igual a %d%n", num1, num2);
        }

        if (num1 > num2) {
            System.out.printf("%d � maior que %d%n", num1, num2);
        }

        if (num1 < num2) {
            System.out.printf("%d � menor que %d%n", num1, num2);
        }

        if (num1 >= num2) {
            System.out.printf("%d � maior ou igual a %d%n", num1, num2);
        }

        if (num1 <= num2) {
            System.out.printf("%d � menor ou igual a %d%n", num1, num2);
        }

    }

//N�vel 2: Estruturas Condicionais

    public static void questao11(){

        Scanner input = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        B = input.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        C = A; 
        A = B; 
        B = C;

        System.out.println("Depois da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

    }

    public static void questao12(){

        Scanner input = new Scanner(System.in);

        int x, modulo;

        System.out.print("Digite um n�mero inteiro: ");
        x = input.nextInt();

        if (x >= 0) {
            modulo = x;
        } else {
            modulo = x * -1;
        }

        System.out.println("O m�dulo de " + x + " �: " + modulo);

    }

    public static void questao13(){

        Scanner input = new Scanner(System.in);

        int a, b, c, d, e, temp;

        System.out.print("Digite o 1� n�mero: ");
        a = input.nextInt();

        System.out.print("Digite o 2� n�mero: ");
        b = input.nextInt();

        System.out.print("Digite o 3� n�mero: ");
        c = input.nextInt();

        System.out.print("Digite o 4� n�mero: ");
        d = input.nextInt();

        System.out.print("Digite o 5� n�mero: ");
        e = input.nextInt();

        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (a > d) { temp = a; a = d; d = temp; }
        if (a > e) { temp = a; a = e; e = temp; }

        if (b > c) { temp = b; b = c; c = temp; }
        if (b > d) { temp = b; b = d; d = temp; }
        if (b > e) { temp = b; b = e; e = temp; }

        if (c > d) { temp = c; c = d; d = temp; }
        if (c > e) { temp = c; c = e; e = temp; }

        if (d > e) { temp = d; d = e; e = temp; }

        System.out.println("\nOrdem crescente: " + a + " " + b + " " + c + " " + d + " " + e);

        System.out.println("Ordem decrescente: " + e + " " + d + " " + c + " " + b + " " + a);
        
    }

    public static void questao14(){

        Scanner input = new Scanner(System.in);

        int num1, num2, diferenca;

        System.out.print("Digite o primeiro n�mero: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            diferenca = num1 - num2;
            System.out.println("A diferen�a do maior para o menor �: " + diferenca);
        } else {
            diferenca = num2 - num1;
            System.out.println("A diferen�a do maior para o menor �: " + diferenca);
        }
    }

    public static void questao15(){

      Scanner input = new Scanner(System.in);

        double n1, n2, n3, n4;
        double media, recu, novaMedia;

        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = input.nextDouble();
        System.out.print("Digite a quarta nota: ");
        n4 = input.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("M�dia inicial: %.2f%n", media);

        if (media >= 7) {
            System.out.printf("Aluno aprovado com m�dia %.2f%n", media);
        } else {
            // Recupera��o
            System.out.print("Digite a nota da recupera��o: ");
            recu = input.nextDouble();

            novaMedia = (media + recu) / 2;

            System.out.printf("Nova m�dia: %.2f%n", novaMedia);

            if (novaMedia >= 7) {
                System.out.printf("Aluno aprovado na recupera��o com m�dia %.2f%n", novaMedia);
            } else {
                System.out.printf("Aluno reprovado com m�dia %.2f%n", novaMedia);
            }
        }
  

    }

    public static void questao16(){

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro n�mero: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        num2 = input.nextInt();

        // Compara��o
        if (num1 > num2) {
            System.out.printf("O maior n�mero � %d e o menor n�mero � %d%n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("O maior n�mero � %d e o menor n�mero � %d%n", num2, num1);
        } else {
            System.out.printf("Os dois n�meros s�o iguais: %d%n", num1);
        }

    }

    public static void questao17(){

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite um n�mero inteiro: ");
        
        if (input.hasNextInt()) {
            num = input.nextInt();

            if (num >= 0 && num <= 9) {
                System.out.println("valor v�lido");
            } else {
                System.out.println("valor inv�lido");
            }
        } else {
            System.out.println("erro");
        }

    }

    public static void questao18(){

         Scanner input = new Scanner(System.in);

         int codigo;

        System.out.print("Digite um n�mero inteiro: ");
        codigo = input.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tr�s");
                break;
            default:
                System.out.println("C�digo inv�lido");
        }

    }

    public static void questao19(){

        Scanner input = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor do lado A: ");
        A = input.nextInt();

        System.out.print("Digite o valor do lado B: ");
        B = input.nextInt();

        System.out.print("Digite o valor do lado C: ");
        C = input.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("O tri�ngulo � equil�tero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("O tri�ngulo � is�sceles.");
            } else {
                System.out.println("O tri�ngulo � escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos n�o formam um tri�ngulo.");
        }

    }

    public static void questao20(){

        Scanner input = new Scanner(System.in);

        int a, b, c;
        int menor, maior;

        do {
            System.out.print("Digite o valor de A: ");
            a = input.nextInt();
            if (a <= 0) {
                System.out.println("Valor inv�lido! Deve ser maior que 0.");
            }
        } while (a <= 0);

        do {
            System.out.print("Digite o valor de B: ");
            b = input.nextInt();
            if (b <= 0) {
                System.out.println("Valor inv�lido! Deve ser maior que 0.");
            }
        } while (b <= 0);

        do {
            System.out.print("Digite o valor de C: ");
            c = input.nextInt();
            if (c <= 0) {
                System.out.println("Valor inv�lido! Deve ser maior que 0.");
            }
        } while (c <= 0);

        menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.println("\nMenor * Maior = " + (menor * maior));
        System.out.println("Maior / Menor = " + ((double) maior / menor));

    }

    public static void questao21(){

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite um n�mero inteiro: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("O n�mero � positivo.");
        } else if (num < 0) {
            System.out.println("O n�mero � negativo.");
        } else {
            System.out.println("O n�mero � zero.");
        }

    }

    public static void questao22(){

        Scanner input = new Scanner(System.in);

        int A = 0, B = 0, num;

        System.out.print("Digite um n�mero inteiro: ");
        num = input.nextInt();

        if (num > 0) {
            A = num;
        } else if (num < 0) {
            B = num;
        }

        System.out.println("A = " + A + ", B = " + B);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.print("Escolha uma quest�o de 1 a 22: ");
    int opcao = input.nextInt();

    switch (opcao) {
        case 1: questao1(); break;
        case 2: questao2(); break;
        case 3: questao3(); break;
        case 4: questao4(); break;
        case 5: questao5(); break;
        case 6: questao6(); break;
        case 7: questao7(); break;
        case 8: questao8(); break;
        case 9: questao9(); break;
        case 10: questao10(); break;
        case 11: questao11(); break;
        case 12: questao12(); break;
        case 13: questao13(); break;
        case 14: questao14(); break;
        case 15: questao15(); break;
        case 16: questao16(); break;
        case 17: questao17(); break;
        case 18: questao18(); break;
        case 19: questao19(); break;
        case 20: questao20(); break;
        case 21: questao21(); break;
        case 22: questao22(); break;
        default: System.out.println("Op��o inv�lida!"); break;
    }

    input.close();
    
    }
}