import java.util.Scanner;

public class Test {

    private static int a = 3;
    private static int b = 1;
    private static int c = 1;
    private static int d = 2;
    
    public static void main(String[] args){
       int  result = ( ((a== c) && (b == d)) ? 2:((((a>b) && (c>d))) || ((a<b) && (c<d))) ?1:0);
        System.out.println(result);
    }
















    /*

    Scanner sc = new Scanner(System.in);


    public int realScoreHost;
    public int realScoreGuest;

    public int betScoreHost;
    public int betScoreGuest;


    public void getRealScore(int realScoreHost, int realScoreGuest){
        realScoreHost = sc.nextInt();
        realScoreGuest = sc.nextInt();

    }

    public void getBetScore(int betScoreHost, int betScoreGuest){
        betScoreHost = sc.nextInt();
        betScoreGuest = sc.nextInt();
    }

    public int realWinner(int realScoreHost, int realScoreGuest){
        if(realScoreHost==realScoreGuest) {
            return 1;
        }
        if (realScoreHost > realScoreGuest){
                return 2;
            }
        else {
            return 3;
        }

    }

    public int betWinner(int betScoreHost, int betScoreGuest){
        if (betScoreHost == betScoreGuest)
            return 1;
        if (betScoreHost > betScoreGuest){
            return 2;
        }else {
            return 3;
        }
    }

    public static void checkIfBetWin(int realScoreHost, int realScoreGuest, int betScoreHost, int betScoreGuest){
        if ((realScoreHost == betScoreHost) && (realScoreGuest == betScoreGuest)){
            System.out.println("you win 2");
        }
        else {
            System.out.println("fs");
        }

        }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter: ");
        System.out.println("Real score of host");
        int a = sc.nextInt();
        System.out.println("Real score of guest");
        int b = sc.nextInt();
        System.out.println("Bet score of host");
        int c = sc.nextInt();
        System.out.println("Bet score of host");
        int d = sc.nextInt();

        checkIfBetWin(a,b,c,d);

    }



*/
}
