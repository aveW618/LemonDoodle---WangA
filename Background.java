//Avery Wang
//LemonDoodle Project
import doodlepad.*;
public class Background {
    public static void main(String[] args) {
		//adding an image onto the screen form the top left corner
        Pad pad = new Pad("House LemonDoodle", 1800, 1150);
        Image im = new Image("House-Background.jpg", 0, 0);
        
        //resize image to fit full screen
        im.setSize(1800,1150);
        
        //reduce saturation by adding a rectangle over the image to make it more "cloudy"
        Rectangle onTop = new Rectangle(0, 0, 1800, 1150);
        
        //fill the rectangle with a chosen color
        onTop.setFillColor(255, 255, 255, 120);
        
        Rectangle base = new Rectangle(520, 700, 645, 275);
        base.setFilled(false);
        
        Rectangle side1 = new Rectangle(567, 515, 20, 185);
        Rectangle side2 = new Rectangle(1100, 515, 20, 185);
        side1.setFillColor(255, 215, 230);
        side2.setFillColor(255, 215, 230);
        
        
        //variables for scaffolding code
        int start = 520;
        int verticalPosition = 495;
        int width = 66;
        int height = 80;
        int gap = 65;  
        
        //height of rectangle above each arc (awning)
        int awningTopHeight = 95;
		
		//loop to create scaffolded awning
        for (int i = 0; i < 10; i++) {
			
			Arc scallop = new Arc(start + i * gap, verticalPosition, width, height, 180, 180);
			scallop.setFilled(true);
            // rectangle ABOVE each scallop
            Rectangle awningTop = new Rectangle(start + i * gap, verticalPosition - 54, width, awningTopHeight);
            
		//alternating baby pink and baby yellow colors for the scaffolding using an if loop 
			if (i % 2 == 0) {
                awningTop.setFillColor(255, 215, 230);
                scallop.setFillColor(255, 215, 230);
            } 
            else {
                awningTop.setFillColor(255, 245, 200);
                scallop.setFillColor(255, 245, 200);
            }
		}
		for (int i = 0; i < 12; i++) {
			Line ln = new Line(start + i * gap, verticalPosition, start + i * gap, verticalPosition);
			if (i % 2 == 0) {
				ln.setFillColor(255,215,230);
			}
			else {
				ln.setFillColor(255,245,200);
			}
		}
			
		 //Lemonade stand sign image
        Image sign = new Image("PinkLemonadeSign.jpg", 520, 700);
        
        //resize image to fit base
        sign.setSize(645, 275);
        
        Sprite sprite = new Sprite("childGirl.jpg", 570, 700, 190, 5);
        
        // Set Pad timer with a Java lambda function that advances sprite
        pad.setTickHandler( (Pad p, long when) -> { sprite.advance(); } );
        pad.setTickRate(10);
        pad.startTimer();
        
        Oval cupBase1 = new Oval(622, 680, 40, 20);
        Oval cupBase2 = new Oval(672, 680, 40, 20);
        
        Oval cupTop1 = new Oval(620, 650, 55, 20);
        Oval cupTop2 = new Oval(670, 650, 55, 20);
    }
}

