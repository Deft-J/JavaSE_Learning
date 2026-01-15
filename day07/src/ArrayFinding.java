import java.util.Arrays;

public class ArrayFinding {
    public static void main(String[] args) {
        int[] a = {12,23,31,56,43,67};
        boolean b = finding(a, 31);
        System.out.println(b);
    }

    public static boolean finding(int[] a, int x) {
        Arrays.sort(a);
        int i = Arrays.binarySearch(a, x);
        return i >= 0;
    }
}
