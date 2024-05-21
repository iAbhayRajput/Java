import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class DrawingPanel extends JPanel implements KeyListener, MouseListener, MouseMotionListener, WindowListener {
    private List<Line> lines = new ArrayList<>();
    private int startX, startY;
    private Color color = Color.BLACK;

    DrawingPanel() {
        setBackground(Color.WHITE);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);  // Ensure the panel can receive key events
        requestFocusInWindow();  // Request focus to capture key events
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        for (Line line : lines) {
            g.setColor(line.color);
            g.drawLine(line.startX, line.startY, line.endX, line.endY);
        }
    }

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_R:
                color = Color.RED;
                break;
            case KeyEvent.VK_G:
                color = Color.GREEN;
                break;
            case KeyEvent.VK_B:
                color = Color.BLUE;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    // MouseListener methods
    @Override
    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lines.add(new Line(startX, startY, e.getX(), e.getY(), color));
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        lines.add(new Line(startX, startY, e.getX(), e.getY(), color));
        startX = e.getX();
        startY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    // WindowListener methods
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}

class Line {
    int startX, startY, endX, endY;
    Color color;

    Line(int startX, int startY, int endX, int endY, Color color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
    }
}

public class DrawingApp extends JFrame {
    DrawingApp() {
        setTitle("Drawing App");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingPanel panel = new DrawingPanel();
        add(panel);
        addWindowListener(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DrawingApp());
    }
}
