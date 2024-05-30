import java.applet.Applet;
import java.awt.*;

public class SimpleCatApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Draw the head
        g.setColor(Color.gray);
        g.fillOval(100, 100, 200, 200);

        // Draw the ears
        g.setColor(Color.gray);
        int[] xPointsLeftEar = {100, 150, 130};
        int[] yPointsLeftEar = {100, 60, 100};
        g.fillPolygon(xPointsLeftEar, yPointsLeftEar, 3);

        int[] xPointsRightEar = {300, 250, 270};
        int[] yPointsRightEar = {100, 60, 100};
        g.fillPolygon(xPointsRightEar, yPointsRightEar, 3);

        // Draw the eyes
        g.setColor(Color.white);
        g.fillOval(140, 150, 40, 40);
        g.fillOval(220, 150, 40, 40);

        // Draw the pupils
        g.setColor(Color.black);
        g.fillOval(155, 165, 10, 10);
        g.fillOval(235, 165, 10, 10);

        // Draw the nose
        g.setColor(Color.pink);
        g.fillOval(190, 200, 20, 20);

        // Draw the mouth
        g.setColor(Color.black);
        g.drawLine(200, 220, 200, 240);
        g.drawLine(200, 240, 180, 250);
        g.drawLine(200, 240, 220, 250);

        // Draw the whiskers
        g.drawLine(180, 200, 140, 180);
        g.drawLine(180, 210, 140, 210);
        g.drawLine(180, 220, 140, 240);

        g.drawLine(220, 200, 260, 180);
        g.drawLine(220, 210, 260, 210);
        g.drawLine(220, 220, 260, 240);
    }
}
