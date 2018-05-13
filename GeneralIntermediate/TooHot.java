import java.util.Scanner;


public class TooHot {
    public static void main(String[] args) {
    
        Scanner intRead = new Scanner(System.in);
 
        System.out.println("Is it too hot? Please input current temperature >0 in farenheight");
        int Temp = intRead.nextInt();

        Scanner booleanRead = new Scanner(System.in);

        System.out.println("is it summer? true/false");
        boolean isSummer = booleanRead.nextBoolean();

        boolean hot = tooHot(Temp, isSummer);

    

        if (hot) {
           System.out.println(hot+ ", it's too hot today");
        } else {
           System.out.println(hot+ ", it's fine out today");
        }


    }

    public static boolean tooHot(int Temp, boolean isSummer){
       
        boolean hot;

        if (isSummer && 60<=Temp && 100>=Temp) {
            hot=true;
        }   else if (!isSummer && 60<=Temp && 90>=Temp) {
            hot=true;
        }   else {
            hot= false;
        }
        return hot;
    }



}
