import java.util.Scanner;

public class WorkOne {
    public static void main(String[] args) {
        System.out.println("输入三位整数：");
        Scanner scanner=new Scanner(System.in);
        int inputNumber=scanner.nextInt();
        int unitsDigit=inputNumber%10;
        int tensDigit=inputNumber%100/10;
        int hundredsDigit=inputNumber/100;
        System.out.println("转换结果为：");
        System.out.println(unitsDigit + "" + tensDigit + "" + hundredsDigit);

    }
}