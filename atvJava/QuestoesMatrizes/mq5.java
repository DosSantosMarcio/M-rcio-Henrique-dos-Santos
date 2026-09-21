package QuestoesMatrizes;
import java.util.Scanner;

public class mq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();
        boolean encontrado = false;
        int lin = -1;
        int col = -1;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == x) {
                    encontrado = true;
                    lin = i;
                    col = j;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Encontrado na linha " + lin + ", coluna " + col);
        } else {
            System.out.println("não encontrado");
        }
    }
}