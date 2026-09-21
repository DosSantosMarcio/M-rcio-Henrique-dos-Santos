package QuestoesMatrizes;
import java.util.Scanner;

public class mq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        
        int somaAcima = 0;
        int somaAbaixo = 0;
        int somaDiagPrincipal = 0;
        int somaDiagSecundaria = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) {
                    somaAcima += m[i][j];
                }
                if (i > j) {
                    somaAbaixo += m[i][j];
                }
                if (i == j) {
                    somaDiagPrincipal += m[i][j];
                }
                if (i + j == 2) {
                    somaDiagSecundaria += m[i][j];
                }
            }
        }
        
        System.out.println("Acima da diagonal principal: " + somaAcima);
        System.out.println("Abaixo da diagonal principal: " + somaAbaixo);
        System.out.println("Diagonal principal: " + somaDiagPrincipal);
        System.out.println("Diagonal secundária: " + somaDiagSecundaria);
    }
}