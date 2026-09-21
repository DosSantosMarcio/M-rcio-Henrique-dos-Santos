package QuestoesMatrizes;
import java.util.Scanner;

public class mq12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] m1 = new double[2][2];
        double[][] m2 = new double[2][2];
        
        System.out.println("Digite a matriz 1 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("Digite a matriz 2 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = sc.nextDouble();
            }
        }
        
        System.out.println("Opções: a) Somar | b) Subtrair | c) Constante | d) Imprimir");
        char opcao = sc.next().charAt(0);
        
        if (opcao == 'a') {
            double[][] m3 = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m1[i][j] + m2[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'b') {
            double[][] m3 = new double[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m3[i][j] = m2[i][j] - m1[i][j];
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 'c') {
            System.out.println("Digite a constante:");
            double c = sc.nextDouble();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    m1[i][j] += c;
                    m2[i][j] += c;
                }
            }
        } else if (opcao == 'd') {
            System.out.println("Matriz 1:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matriz 2:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}