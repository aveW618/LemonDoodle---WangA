//Avery Wang
//LemonDoodle Project
import doodlepad.*;
public class Background {
    public static void main(String[] args) {
		//adding an image onto the screen form the top left corner
        Pad pad = new Pad("House LemonDoodle", 355, 355);
        Image im = new Image("House-Background.jpg", 0, 0);
        
        //resize image to fit full screen
        im.setSize(1800,1150);
        
        //reduce saturation by adding a rectangle over the image to make it more "cloudy"
        Rectangle onTop = new Rectangle(0, 0, 1800, 1150);
        
        //fill the rectangle with a chosen color
        onTop.setFillColor(255, 255, 255, 120);
        
        //Lemonade stand sign image
        Image sign = new Image("PinkLemonadeSign.jpg", 520, 820);
        
        //resize image to fit full screen
        sign.setSize(520,820,645,400);
        
        Rectangle base = new Rectangle(520, 820, 645, 400);
        base.setFilled(false);
        
        Rectangle side1 = new Rectangle(567, 540, 20, 280);
        Rectangle side2 = new Rectangle(1100, 540, 20, 280);
        
        //loop to create scallop scalfolding
        int start = 520;
        int verticalPosition = 538;
        int width = 66;
        int height = 80;
        int gap = 65;  
        
        for (int i = 0; i < 10; i++) {
            Arc scallop = new Arc(start + i * gap, verticalPosition, width, height, 180, 180);

            scallop.setFilled(true);
            
         // Create the Arc starting at 45 degrees and extending for 90 degrees
        Arc a1 = new Arc(520, 538, 66, 80, 180, 180);
        // Do not fill the arc so only 80 arc is drawn.
        a1.setFillColor(255,255,0);
        Arc a2 = new Arc(585, 538, 66, 80, 180, 180);
        a2.setFillColor(255,0,255);
        Arc a3 = new Arc(649, 538, 66, 80, 180, 180);
        a3.setFilled(false);
        Arc a4 = new Arc(714, 538, 58, 80, 180, 180);
        a4.setFilled(false);
        Arc a5 = new Arc(770, 538, 66, 80, 180, 180);
        a5.setFilled(false);
        Arc a6 = new Arc(835, 538, 66, 80, 180, 180);
        a6.setFilled(false);
        Arc a7 = new Arc(900, 538, 66, 80, 180, 180);
        a7.setFilled(false);
        Arc a8 = new Arc(964, 538, 66, 80, 180, 180);
        a8.setFilled(false);
        Arc a9 = new Arc(1029, 538, 66, 80, 180, 180);
        a9.setFilled(false);
        Arc a10 = new Arc(1095, 538, 66, 80, 180, 180);
        a10.setFilled(false);
    }
}

