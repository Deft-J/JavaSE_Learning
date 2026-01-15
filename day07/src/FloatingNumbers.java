import java.util.Arrays;

public class FloatingNumbers {
    public static void main(String[] args) {

        double[] x={3.1415,5.6789,4.523,7.658};
        round(x);
        System.out.println(Arrays.toString(x));

    }
    public static void round(double[] x){

        for (int i = 0; i < x.length; i++) {
            x[i]=keepTwo(x[i]);

        }
    }
    public static double keepTwo(double v){//3.14
        return (int)(v*100+0.5)/100D;
    }
}
