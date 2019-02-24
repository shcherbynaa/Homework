public class Rhombus {

    public static void rhombus(int num){

        int line = num * 2 -1;
        int star = 1;
        int zeroline = (line - star)/2;

        for (int i = 0; i < num; i++) {

            for (int k = 0; k < zeroline; k++) {
                System.out.print(" ");
            }
            for (int k = zeroline; k < (zeroline + star); k++) {
                System.out.print("* ");
            }

            star += 1;
            zeroline-=1;
            System.out.println();
        }

        star -= 2;
        zeroline = (line - star)/2+1;



        for (int i = num; i > 0 ; i--) {
        /*    for (int k = num; k < zeroline; k++) {
                System.out.print(" ");
            }
            */
            for (int k = zeroline + star+1; k<line; k++){
                System.out.print(" ");
            }
            for (int k = zeroline; k < (zeroline + star); k++) {
                System.out.print("* ");
            }
            star -= 1;
            zeroline+=0;
            System.out.println();
        }
    }

    public static void main(String[] args){
        rhombus(5);
    }


}
