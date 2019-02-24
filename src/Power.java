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

    public static void rhombus(int num){

        int line = num * 2 -1;
        int star = 1;
        int zeroline = (line - star)/2;

        for (int i = 0; i < num; i++) {

                for (int k = 0; k < zeroline; k++) {
                    System.out.print(" ");
                }
                for (int k = zeroline; k < (zeroline + star); k++) {
                    System.out.print("*");
                }
                for (int k = zeroline + star; k<line; k++){
                    System.out.print(" ");
                }
                star += 2;
                zeroline-=1;
            System.out.println();
        }
        star -= 4;
        zeroline = (line - star)/2;

        for (int i = num; i > 0 ; i--) {
            for (int k = num; k < zeroline; k++) {
                System.out.print(" ");
            }

            for (int k = zeroline + star; k<line; k++){
                System.out.print(" ");
            }
            for (int k = zeroline; k < (zeroline + star); k++) {
                System.out.print("*");
            }
            star -= 2;
            zeroline+=1;
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println(square(2));
        System.out.println(cube(2));
        System.out.println(power(2,5));
        rhombus(5);
    }
}
