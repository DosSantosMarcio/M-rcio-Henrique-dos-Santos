package QuestoesMatrizes;
import java.util.Scanner;

public class mq11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] alunos = new int[5][4];
        
        int maiorNota = -1;
        int matMaiorNota = -1;
        int somaNotas = 0;
        
        for (int i = 0; i < 5; i++) {
            alunos[i][0] = sc.nextInt();
            alunos[i][1] = sc.nextInt();
            alunos[i][2] = sc.nextInt();
            alunos[i][3] = alunos[i][1] + alunos[i][2];
            
            somaNotas += alunos[i][3];
            
            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                matMaiorNota = alunos[i][0];
            }
        }
        
        System.out.println("Matrícula da maior nota: " + matMaiorNota);
        System.out.println("Média final da turma: " + (somaNotas / 5.0));
    }
}