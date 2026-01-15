import java.util.Scanner;

public class WorkThree {
    public static void main(String[] args) {
        System.out.println("输入一个小数：");
        Scanner sc=new Scanner(System.in);
        double inputNumber=sc.nextDouble();
        double roundedNumber=inputNumber*100+0.5;
        int integerPart=(int)roundedNumber;
        double result=(double)integerPart/100;
        System.out.println("四舍五入保留两位小数输出为：");
        System.out.println(result);
    }
}
