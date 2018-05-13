import java.util.Scanner;

public class UniqueSum {

    public static void main(String[] args) {


    Scanner intRead = new Scanner(System.in);

       System.out.println("Please input three numbers >0");

        int[] intArray = new int[3];

       for (int i = 0; i < 3; i++) {
           intArray[i] = intRead.nextInt();
        }
    

       System.out.println("Unique Total = " + uniqueCalc(intArray[0], intArray[1], intArray[2]));
    }

    public static int uniqueCalc(int A, int B, int C){

        int[] intArray = {A, B, C};

        int sumTotal = 0;

        if (intArray[0]==intArray[1] && intArray[1]==intArray[2]) {
            sumTotal = 0;
        } else if (intArray[0]==intArray[1]) {
            sumTotal = intArray[2];
        } else if (intArray[0]==intArray[2]) {
            sumTotal = intArray[1];
        } else if (intArray[1]==intArray[2]) {
            sumTotal = intArray[0];
        }  else {
            sumTotal = intArray[0]+intArray[1]+intArray[2];
        }

        return sumTotal;
        
    }

}