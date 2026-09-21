package QuestoesMatrizes;
import java.util.Scanner;

public class mq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int linhaMaior = 0;
        int colunaMaior = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
                if (i == 0 && j == 0) {
                    linhaMaior = 0;
                    colunaMaior = 0;
                } else if (m[i][j] > m[linhaMaior][colunaMaior]) {
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        
        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Maior valor: " + m[linhaMaior][colunaMaior]);
        System.out.println("Localização: linha " + linhaMaior + ", coluna " + colunaMaior);
    }
}