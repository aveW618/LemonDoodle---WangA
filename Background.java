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
        
        Rectangle base = new Rectangle(520, 680, 645, 400);
        base.setFilled(false);
        
         //Lemonade stand sign image
        Image sign = new Image("PinkLemonadeSign.jpg", 520, 680);
        
        //resize image to fit full screen
        sign.setSize(645, 400);
        
        Rectangle side1 = new Rectangle(567, 500, 20, 280);
        Rectangle side2 = new Rectangle(1100, 500, 20, 280);
        
        //variables for scaffolding code
        int start = 520;
        int verticalPosition = 498;
        int width = 66;
        int height = 80;
        int gap = 65;  
        
        //loop that creates even scallops for the stand
        for (int i = 0; i < 10; i++) {
            Arc scallop = new Arc(start + i * gap, verticalPosition, width, height, 180, 180);

            scallop.setFilled(true);
    
		//alternating baby pink and baby yellow colors for the scaffolding using an if loop 
			if (i % 2 == 0) {
				scallop.setFillColor(255, 215, 230); 
			} 
			else {
				scallop.setFillColor(255, 245, 200); 
			}
		}
    }
}

