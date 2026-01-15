import java.util.Scanner;

public class Min{
    public static void main(String[] args) {
        System.out.println("请输入三个数：");
        Scanner scanner=new Scanner(System.in);
        int firstNumber=scanner.nextInt();
        int secondNumber=scanner.nextInt();
        int thirdNumber=scanner.nextInt();
        int min= Math.min(firstNumber, secondNumber);
        min= Math.min(min, thirdNumber);
        System.out.println(min);

    }
}