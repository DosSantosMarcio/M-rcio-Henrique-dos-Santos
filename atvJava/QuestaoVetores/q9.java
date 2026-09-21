package QuestaoVetores;
public class q9 {
    public static void main(String[] args) {
        int[] v = new int[100];
        int preenchidos = 0;
        int num = 1;
        
        while (preenchidos < 100) {
            if (num % 7 != 0 || num % 10 == 7) {
                v[preenchidos] = num;
                preenchidos++;
            }
            num++;
        }
        
        for (int i = 0; i < 100; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}