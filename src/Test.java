public class Test {

    public static void resultOfBet(int realHostScore, int realGuestScore, int betHostScore, int betGuestScore){
        int  result = ( ((realHostScore == betHostScore) && (realGuestScore ==  betGuestScore)) ? 2:((((realHostScore>realGuestScore) &&
                (betHostScore>betGuestScore))) || ((realHostScore<realGuestScore) && (betHostScore<betGuestScore))) ?1:0);
        System.out.println(result);
    }
    
    public static void main(String[] args){
      resultOfBet(3,4,3,2);
    }

}
