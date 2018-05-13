import java.util.Scanner;

public class ParametersOperators {
  static int total;

    public static void main(String[] args) {
         Scanner user_input= new Scanner(System.in);

        int A = user_input.nextLine();
        int B = user_input.nextLine();

        // int A = 5;
        // int B = 10;
        
        sum(A,B);

        System.out.println(total);

    }

    public static int sum(int A, int B) {
        
        total = A+B;

        return total;

    }
}