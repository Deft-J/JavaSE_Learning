import java.util.Arrays;
import java.util.Scanner;

public class OrderedArray{
    public static void main(String[] args){
        int[] x={4,2,1,6,8,3};
        Arrays.sort(x);
        boolean a=true;
        for (int i=0;i<x.length-1;i++){
            if(x[i]>=x[i+1]){
                a=false;
                break;
            }
        }System.out.println(Arrays.toString(x));
        System.out.println(a?"有序":"无序");



    }
}