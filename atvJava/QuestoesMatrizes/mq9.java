package QuestoesMatrizes;
import java.util.Random;

public class mq9 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] cartela = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int num;
                boolean repetido;
                do {
                    repetido = false;
                    num = rnd.nextInt(100);
                    
                    for (int k = 0; k <= i; k++) {
                        int limite = (k == i) ? j : 5;
                        for (int l = 0; l < limite; l++) {
                            if (cartela[k][l] == num) {
                                repetido = true;
                                break;
                            }
                        }
                        if (repetido) break;
                    }
                } while (repetido);
                
                cartela[i][j] = num;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}