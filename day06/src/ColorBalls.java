import java.util.Arrays;

public class ColorBalls {
    public static void main(String[] args){
        int[] red = new int[6];
        boolean[] a = new boolean[34];

        for (int i = 0; i < red.length;) {
            int num = (int) (Math.random() * 33) + 1;
            if (!a[num]) {
                red[i] = num;
                a[num] = true;
                i++;}
        }
        Arrays.sort(red);
        System.out.println("红球：");
        System.out.println(Arrays.toString(red));
        int[] blue= new int[]{(int) (Math.random() * 16) + 1};
        System.out.println("蓝球：");
        System.out.println(Arrays.toString(blue));
    }
}
