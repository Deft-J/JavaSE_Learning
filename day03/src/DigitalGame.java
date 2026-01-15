import java.util.Scanner;

public class DigitalGame {
    public static void main(String[] args) {
        System.out.println("欢迎进入数字游戏！");
        System.out.println("请输入一个非0的一位整数：");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=x*9;
        int z=(y>9 & y<100)?(y/10+y%10):y;
        z=z*27+7;
        System.out.println(z);

    }
}
