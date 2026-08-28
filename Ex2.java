import java.util.Scanner;
public class Ex2 {
    public static void rodar() {
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Preenchimento do primeiro vetor:");
        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            v1[i] = input.nextInt();
        }
        System.out.println("Preenchimento do segundo vetor:");
        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            v2[i] = input.nextInt();
        }
        input.close();
        // Somar as posições correspondentes de cada vetor
        for(int i = 0; i < 10; i++) 
            v3[i] = v1[i] + v2[i];

        System.out.println("Imprimindo o primeiro vetor:");
        for(int num : v1)
            System.out.print(num + ", ");

        System.out.println();
        System.out.println("Imprimindo o segundo vetor:");
        for(int num : v2)
            System.out.print(num + ", ");

        System.out.println();
        System.out.println("Soma dos números armazenados em cada posição dos vetores:");
        for(int num : v3)
            System.out.print(num + ", ");
    }
}