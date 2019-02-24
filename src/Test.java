import java.util.Scanner;

public class Test {

    private static int a = 3;
    private static int b = 4;
    private static int c = 1;
    private static int d = 2;
    
    public static void main(String[] args){
       int  result = ( ((a == c) && (b == d)) ? 2:((((a>b) && (c>d))) || ((a<b) && (c<d))) ?1:0);
        System.out.println(result);
    }

}
