import java.util.Scanner;
public class LotteryTicket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("选择彩票类型:3.3D彩票 5.5D彩票");
        int t=scanner.nextInt();
        while (t != 3 && t != 5) {
            System.out.println("输入的类型错误");
            t = scanner.nextInt();
        }
        System.out.println("请输入购买注数");
        int m=scanner.nextInt();
        int[][] x=lottery(t,m);
        print(x);
    }

    public static int[][] lottery(int t, int m) {
        int[][] x = new int[m][t];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j]=(int)(Math.random()*10);
            }
        }
        return x;
    }
    public static void print(int[][] x){
        for (int[] a : x) {
            for (int i : a) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}