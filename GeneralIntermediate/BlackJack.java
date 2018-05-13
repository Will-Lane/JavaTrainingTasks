import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {

        Scanner intRead = new Scanner(System.in);

       System.out.println("Please input two numbers >0");

       int A = intRead.nextInt();
       int B = intRead.nextInt();


 //       System.out.println(A + ", " + B);
              System.out.println(calc(A,B));
  }

    public static int calc(int A, int B) {
        
 //       System.out.println(A + ", " + B);
        int winner=0;

        if (A > 21 && B > 21) {
            winner = 0;
        }
        else if (A>B && A<=21) {
            winner = A;
        }
        else if (B>A && B<=21) {
            winner = B;
        }
        else if (B==A) {
            winner = A;
        }
         else if (A>21 && B<=21) {
            winner = B;
        }
         else if (B>21 && A<=21) {
            winner = A;
        }
        return winner;

    }
}
   