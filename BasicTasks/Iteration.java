public class Iteration {
  static int total;

    public static void main(String[] args) {
        
        int A = 5;
        int i;
        boolean add = true;

        for (i = 0;i < 10; i++) {
        sum(A,i,add);

        System.out.println(total);

        
        }

    }

    public static int sum(int A, int i, boolean add) {
        
        int B = i;

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