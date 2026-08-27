import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] vetorDeVetores = new int[2][3];
        for(int i = 0; i < vetorDeVetores.length; i++) {
            for(int j = 0; j < vetorDeVetores[i].length; j++) {
                System.out.print("Digite um número: ");
                vetorDeVetores[i][j] = input.nextInt();
            }
        }
        System.out.println("Vetor de vetores informado:");
        for(int i = 0; i < vetorDeVetores.length; i++) {
            for(int j = 0; j < vetorDeVetores[i].length; j++)
                System.out.printf("%2d  ", vetorDeVetores[i][j]);

            System.out.println();
        }
        input.close();
    }
}