package QuestaoVetores;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int inseridos = 0;
        
        while (inseridos < 10) {
            int num = sc.nextInt();
            boolean repetido = false;
            for (int i = 0; i < inseridos; i++) {
                if (v[i] == num) {
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                System.out.println("Número já digitado, digite outro:");
            } else {
                v[inseridos] = num;
                inseridos++;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}