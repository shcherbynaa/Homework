public class Power {

    public static double square(int num){
        return Math.pow(num,2);
    }

    public static double cube(int num){
        return Math.pow(num,3);
    }

    public static double power(int num, int pow){
        return Math.pow(num, pow);
    }



    public static void main(String[] args){
        System.out.println(square(2));
        System.out.println(cube(2));
        System.out.println(power(2,5));
    }
}
