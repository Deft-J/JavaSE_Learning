public class AbsoluteValue {
    public static void main(String[] args) {
        int a = abs(-5);
        System.out.println(a);
    }
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }
}
