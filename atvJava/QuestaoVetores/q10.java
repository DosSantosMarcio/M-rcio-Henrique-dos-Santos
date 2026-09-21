package QuestaoVetores;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];
        
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            y[i] = sc.nextInt();
        }
        
        System.out.print("Soma: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((x[i] + y[i]) + " ");
        }
        System.out.println();
        
        System.out.print("Produto: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((x[i] * y[i]) + " ");
        }
        System.out.println();
        
        System.out.print("Diferença: ");
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();
        
        System.out.print("Interseção: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
        
        System.out.print("União: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.print(y[i] + " ");
            }
        }
        System.out.println();
    }
}