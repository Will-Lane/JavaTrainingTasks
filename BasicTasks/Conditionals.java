public class Conditionals {
  static int total;

    public static void main(String[] args) {
         
        int A = 5;
        int B = 10;
        boolean add = false;

        sum(A,B,add);

        System.out.println(total);

    }

    public static int sum(int A, int B, boolean add) {
        
        if (add) {

            total = A+B;
        }else {
            total = A*B;
        }

        return total;

    }
}