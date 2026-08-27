import java.util.ArrayList;
import java.util.Scanner;
public class Ex1 {
    public static void rodar() {
        int[] numeros = new int[10]; // Vetor que armazena os números
        ArrayList<Integer> negativos = new ArrayList<Integer>(); // Lista para armazenar as posições que armazenam números negativos, se o usuário digitar algum
        Scanner teclado = new Scanner(System.in);
        // Inicia maior com o menor valor possível de int e menor com o maior valor possível de int.
        // Praticamente qualquer valor que o usuário digitar, fará alteração nessas variáveis.
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;
        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = teclado.nextInt();
            numeros[i] = num;
            if(num < menor) menor = num;
            if(num > maior) maior = num;
            if(num < 0)
                negativos.add(i);
        }
        teclado.close();
        System.out.println("Imprimindo o vetor:");
        int somaPares = 0;
        // Percorrer todo o vetor
        for(int numero : numeros) {
            System.out.print(numero + ", ");
            if(numero % 2 == 0)
                somaPares += numero;
        }
        System.out.println();
        System.out.println("Soma dos números pares do vetor: " + somaPares);
        // Impressão das posições que armazenam números negativos, se houver
        if(negativos.size() > 0) {
            System.out.println("Posições que contém números negativos:");
            for(int num : negativos)
                System.out.print(num + ", ");

            System.out.println();
        }
        else
            System.out.println("Este vetor não contém números negativos");

        System.out.printf("Menor número do vetor: %d\n", menor);
        System.out.printf("Maior número do vetor: %d\n", maior);
        System.out.println("Números armazenados nas posições ímpares do vetor:");
        for(int i = 0; i < numeros.length; i++) {
            if(i % 2 != 0)
                System.out.print(numeros[i] + ", ");
        }
    }
}