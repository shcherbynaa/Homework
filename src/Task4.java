public class Task4 {
    

    public static int factorial(int num){
        int result = 1;
        for (int i = 1; i <=num ; i++) {
            result = result *i;
        }

        System.out.println(result);
        return result;
    }

    public static int fibonachi(int num){

        if((num == 1) || (num == 2))
            return 1;
       return (fibonachi(num-1) + fibonachi(num-2));
    }


    public static void main(String[] args){

        factorial(8);
        System.out.println(fibonachi(10));

    }
}
