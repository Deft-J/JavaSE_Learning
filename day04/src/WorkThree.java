import java.util.Scanner;

public class WorkThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        double x=sc.nextDouble();
        System.out.println("请输入第二个数：");
        double y=sc.nextDouble();
        System.out.println("请输入运算符");
        String op=sc.next();
        double a=0.0;
        a = switch (op) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> a;
        };
        int b=(int)a;
        if (a == b){
            System.out.println(x+op+y+"="+b);
        }else {
            System.out.println(x+op+y+"="+a);
        }

    }
}
