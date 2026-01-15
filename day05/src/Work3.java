public class Work3 {
    public static void main(String[] args) {
        int a;//鸡
        int b;//兔
        for(a=0;a<=50;a++){
            for(b=0;b<=50;b++){
                if(a+b==50 && 2*a+4*b==120){
                    System.out.println("鸡:"+a);
                    System.out.println("兔:"+b);
                }
            }
        }

    }
}
