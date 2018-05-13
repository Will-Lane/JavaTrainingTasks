public class Conditionals2 {
  static int total;

    public static void main(String[] args) {
         
        int A = 5;
        int B = 10;
        boolean add = false;

        sum(A,B,add);

        System.out.println(total);

    }

    public static int sum(int A, int B, boolean add) {
        
        if (A==0) {
            total = B;
        }
         else if (B==0){
             total = A;
         }

         else if (add) {

                 total = A+B;
         } 
             else {
                 total = A*B;
         }

        return total;

    }
}