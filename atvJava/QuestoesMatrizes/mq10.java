package QuestoesMatrizes;
import java.util.Scanner;

public class mq10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[] somaColunas = new int[3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                somaColunas[j] += m[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.print(somaColunas[i] + " ");
        }
        System.out.println();
    }
}