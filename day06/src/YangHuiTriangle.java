import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) {
        int[][] x = new int[10][];
        for (int i = 0; i < x.length; i++) {
            x[i] = new int[i + 1];
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (j==0 || i==j) {
                    x[i][j] =1;
                } else {
                    x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
                }
            }
        }
        for (int[] a : x) {
            for (int i : a) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
