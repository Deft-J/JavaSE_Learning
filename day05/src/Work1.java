import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = false;
        for (int i = 2; i < a; i++) {
            if (a%i==0){
                b=true;
            }
        }
        if(b){
            System.out.println(a+"不是素数");
        }else{
            System.out.println(a+"是素数");
        }

    }
}