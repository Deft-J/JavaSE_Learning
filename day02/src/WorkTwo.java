import java.util.Scanner;

public class WorkTwo {
    public static void main(String[] args) {
        System.out.println("输入一个小数：");
        Scanner sc=new Scanner(System.in);
        double inputNumber=sc.nextDouble();
        inputNumber=inputNumber*100;
        int truncatedValue=(int)inputNumber;
        double result=(double)truncatedValue/100;
        System.out.println("保留两位小数输出为：");
        System.out.println(result);
    }
}
