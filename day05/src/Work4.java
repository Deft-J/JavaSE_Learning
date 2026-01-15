import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean b = false;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    b = true;
                    break;
            }
            }if(!b){
                System.out.println(i);
        }

        }

    }
}