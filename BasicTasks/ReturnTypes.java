public class ReturnTypes {
  static String greeting;

    public static void main(String[] args) {

         hello();
         
         System.out.println(greeting);

    }

    public static String hello() {
        
        greeting = "Hello World!";

        return greeting;

    }
}