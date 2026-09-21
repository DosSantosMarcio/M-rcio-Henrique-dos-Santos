package QuestoesMatrizes;
import java.util.Scanner;

public class mq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];
        int maioresQue10 = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = sc.nextInt();
                if (m[i][j] > 10) {
                    maioresQue10++;
                }
            }
        }
        System.out.println("Valores maiores que 10: " + maioresQue10);
    }
}