import java.awt.*;
import javax.swing.JFrame;

public class GraphicD extends Canvas {

    public void paint(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(20, 10, 523, 50);

        g.setColor(Color.blue);
        g.fillRect(20, 60, 523, 70);

        g.setColor(Color.lightGray);
        g.fillRect(20, 130, 523, 35);
        g.setColor(Color.blue);
        g.fillRect(20, 165, 523, 70);

        g.setColor(Color.lightGray);
        g.fillRect(20, 235, 523, 35);
        g.setColor(Color.blue);
        g.fillRect(20, 270, 523, 70);

        g.setColor(Color.lightGray);
        g.fillRect(20, 340, 523, 35);
        g.setColor(Color.blue);
        g.fillRect(20, 375, 523, 70);

        g.setColor(Color.lightGray);
        g.fillRect(20, 445, 523, 35);
        g.setColor(Color.blue);
        g.fillRect(20, 480, 523, 70);

    }

    public static void main(String[] args) {
        GraphicD m = new GraphicD();
        JFrame j = new JFrame();
        j.add(m);
        j.setSize(650, 600);  
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
