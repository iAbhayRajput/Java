import java.awt.*;
import javax.swing.JFrame;

public class EngineeringBlock extends Canvas {

    public void paint(Graphics g) {
	g.setColor(Color.black);
	g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        g.drawString("EB's", 30, 30);
	g.drawString("Front View", 30, 60);
        setBackground(Color.WHITE);
	//setForeground(Color.BLUE);
/* --------------5th floor-----------------*/
	
	g.setColor(Color.lightGray);
	g.fillRect(110, 100, 10, 538);
        g.fillRect(120, 100, 523, 50);
	g.fillRect(643, 100, 20, 538);

	g.setColor(Color.blue);
        g.fillRect(120, 150, 103, 70);//5th class
        g.fillRect(225, 150, 103, 70);
        g.fillRect(330, 150, 103, 70);
        g.fillRect(435, 150, 103, 70);
        g.fillRect(540, 150, 103, 70);//1st 

/* --------------4th floor-----------------*/
	
	g.setColor(Color.lightGray);
        g.fillRect(120, 220, 523, 35);
	g.setColor(Color.blue);
        g.fillRect(120, 255, 103, 70);//5th class
        g.fillRect(225, 255, 103, 70);
        g.fillRect(330, 255, 103, 70);
        g.fillRect(435, 255, 103, 70);
        g.fillRect(540, 255, 103, 70);//1st 

/* --------------3rd floor-----------------*/
	
	g.setColor(Color.lightGray);
        g.fillRect(120, 325, 523, 35);
	g.setColor(Color.blue);
        g.fillRect(120, 360, 103, 70);//5th class
        g.fillRect(225, 360, 103, 70);
        g.fillRect(330, 360, 103, 70);
        g.fillRect(435, 360, 103, 70);
        g.fillRect(540, 360, 103, 70);//1st 

/* --------------2nd floor-----------------*/
	
	g.setColor(Color.lightGray);
        g.fillRect(120, 430, 523, 35);
	g.setColor(Color.blue);
        g.fillRect(120, 465, 103, 70);//5th class
        g.fillRect(225, 465, 103, 70);
        g.fillRect(330, 465, 103, 70);
        g.fillRect(435, 465, 103, 70);
        g.fillRect(540, 465, 103, 70);//1st 

/* --------------1st floor-----------------*/
	
	g.setColor(Color.lightGray);
        g.fillRect(120, 535, 523, 35);
	g.setColor(Color.blue);
        g.fillRect(120, 570, 103, 70);//5th class
        g.fillRect(225, 570, 103, 70);
        g.fillRect(330, 570, 103, 70);
        g.fillRect(435, 570, 103, 70);

/* --------------staircase-----------------*/

	g.setColor(Color.darkGray);

        g.fillRect(540, 570, 103, 12);//last step 
	g.fillRect(540, 584, 103, 12);
	g.fillRect(540, 598, 103, 12);
	g.fillRect(540, 612, 103, 12);
	g.fillRect(540, 626, 103, 12);


/* --------------last 2nd division-----------------*/

	g.setColor(Color.lightGray);
	g.fillRect(538, 100, 14, 538);

/* --------------Bushes-----------------*/


/*	g.setColor(Color.green);
        g.fillRect(120, 640, 103, 70);//5th class
        g.fillRect(225, 640, 103, 70);
        g.fillRect(330, 640, 103, 70);
        g.fillRect(435, 640, 103, 70);
*/

    }

    public static void main(String[] args) {
        EngineeringBlock m = new EngineeringBlock();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(1000, 1000);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

}
