public class Work2 {
    public static void main(String[] args) {
        for(int a=100;a<1000;a++){
            int b=a/100;
            int c=a/10%10;
            int d=a%10;
            if(a == Math.pow(b,3)+Math.pow(c,3)+Math.pow(d,3)){
                System.out.println(a);
            }
        }
    }
}
