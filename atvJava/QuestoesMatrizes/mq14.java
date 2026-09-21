package QuestoesMatrizes;
import java.util.Scanner;

public class mq14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String nome = sc.next();
            int[] diasFaltas = new int[30];
            int totalFaltas = 0;
            
            for (int dia = 1; dia <= 30; dia++) {
                String presenca = sc.next();
                if (presenca.equals("F")) {
                    diasFaltas[totalFaltas] = dia;
                    totalFaltas++;
                }
            }
            
            if (totalFaltas > 10) {
                System.out.print(nome + " dias: ");
                for (int k = 0; k < totalFaltas; k++) {
                    System.out.print(diasFaltas[k] + " ");
                }
                System.out.println();
            }
        }
    }
}