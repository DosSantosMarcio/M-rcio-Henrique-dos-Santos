package QuestaoVetores;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] r = new int[20];
        
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            b[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            r[2 * i] = a[i];
            r[2 * i + 1] = b[i];
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }
}