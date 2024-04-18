// Demonstrate some virtual key codes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
 <applet code="KeyEvents1" width=300 height=100>
 </applet>
*/

public class KeyEvents1 extends Applet
        implements KeyListener {
    String msg = "";
    int X = 10, Y = 20; // Output coordinates

    public void init() {
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        // Get the key code of the pressed key
        int keyCode = ke.getKeyCode();
        // Update the message with the key code (ASCII value)
        msg = "Key code: " + keyCode;
        // Repaint the applet to display the updated message
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
        // Get the character representation of the typed key
        char keyChar = ke.getKeyChar();
        // Get the ASCII value of the character
        int asciiValue = (int) keyChar;
        // Update the message with the ASCII value
        msg = "ASCII value: " + asciiValue;
        // Repaint the applet to display the updated message
        repaint();
    }

    // Display the key code or ASCII value
    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }
}
