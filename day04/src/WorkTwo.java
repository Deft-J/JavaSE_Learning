import java.util.Scanner;

public class WorkTwo {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if (x<0 | x>100){
            System.out.println("成绩录入错误！");
        }else{
            switch (x/10){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("E");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 9:
                case 10:
                    System.out.println("A");
                    break;
            }
        }
    }
}
