package drawbox;

public class drawingboxes {
    public static void main(String[] args) {
        drawBox();
        System.out.println();
       /* drawBox();
        System.out.println();
        drawBox();
        System.out.println();
        drawBox();
        System.out.println();
        drawBox();*/
        
      //Use for loop to create 5 boxes
        for (int i = 0; i <5; i++){
        	drawBox();
        }
    }
    
    public static void drawBox() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}