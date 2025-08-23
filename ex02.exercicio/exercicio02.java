import java.util.Scanner;
public class exercicio02 {

    public static void main(String[] args) {
        Scanner dado = new Scanner (System.in);
        

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ",");
        }
         for (int i = 1; i <= 100; i += 2) {
                System.out.println(i + ",");
        }
          for (int i = 1; i <= 100; i++ ) {
            if (i % 2 == 0) {
                System.out.println(i + ",");
            }
            
        }   
        for(int i = 1; i <= 100; i++ ){
            if (i % 3 == 0) {
                System.out.println(i + ",");
            }
        }
    }
}
