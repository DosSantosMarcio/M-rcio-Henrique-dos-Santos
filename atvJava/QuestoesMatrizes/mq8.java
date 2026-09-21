package QuestoesMatrizes;
import java.util.Random;

public class mq8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] original = new int[4][4];
        int[][] transformada = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                original[i][j] = rnd.nextInt(20) + 1;
                if (i < j) {
                    transformada[i][j] = 0;
                } else {
                    transformada[i][j] = original[i][j];
                }
            }
        }
        
        System.out.println("Matriz Original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(original[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz Transformada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transformada[i][j] + "\t");
            }
            System.out.println();
        }
    }
}