public class IterationAndArrays2 {
//  static int total;

    public static void main(String[] args) {
        
        int i;
//       boolean add = false;
        int[] intArray = new int[10];

        for (i = 0; i < 10; i++){
            intArray[i] = i;
            if (i < 9) {
            System.out.print(intArray[i] + ", ");
            } else {
                System.out.println(intArray[i]);
            }
        }

        for (i = 0; i < 10; i++){
            intArray[i] = i*10;
            if (i < 9) {
            System.out.print(intArray[i] + ", ");
            } else {
                System.out.println(intArray[i]);
            }
        }
        // for (i = 0;i < 10; i++) {
        // sum(intArray[i],i,add);

        

        
        // }

    }

//     public static int sum(int intArray, int i, boolean add) {
        
//         int A = intArray;
//         int B = i;

//         if (A==0) {
//             total = B;
//         }
//          else if (B==0){
//              total = A;
//          }

//          else if (add) {

//                  total = A+B;
//          } 
//              else {
//                  total = A*B;
//          }

//         return total;

//     }
}