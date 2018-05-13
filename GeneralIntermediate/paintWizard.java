import java.util.scanner;

public class PaintWizard {

    public static void main(string[] args) {

        int numberOfWalls;
        float width;
        float height;
        Scanner scann = new scanner(System.in);
        Room room = new Room();
        System.out.println("please enter number of walls to be painted:");
        numberOfWalls = scann.NextInt();

        for(int i = 0; i < numberOfWalls; i ++){
        System.out.println("please enter a height for wall number " + i + ":");
        height = scann.NextInt();
         System.out.println("please enter a width for wall number " + i + ":");
        width = scann.NextInt();

        
        room.setSurfaceArea(width,height);
            
        }





    }



    
}


public class CalcPaint{
    
    public int cheapoMax() {


    }

    public int averageJoes() {


    }

    public int deluxourousPaints() {


    }


}

public class Room{

    private int surfaceArea;



    public void setSurfaceArea(int width, int height){
        surfaceArea = surfaceArea + (width*height);

    }


    public int getSurfaceArea(){
        return surfaceArea;
    }
        
    
}