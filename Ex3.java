import java.util.Scanner;
class Ex3 {
    public static void rodar() {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            array[i] = input.nextInt();
        }
        input.close();
        int soma1 = 0, soma2 = 0;
        // Somar os números de cada metade do vetor
        for(int i = 0; i < 5; i++)
            soma1 += array[i];

        for(int i = 5; i < 10; i++)
            soma2 += array[i];

        int diferenca = soma1 - soma2;
        System.out.println("Valores calculados:");
        System.out.printf("Soma dos números da primeira metade do vetor: %d\n", soma1);
        System.out.printf("Soma dos números da segunda metade do vetor: %d\n", soma2);
        System.out.printf("Diferença entre a primeira e a segunda soma: %d\n", diferenca);
    }
}