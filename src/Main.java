import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JFrame implements KeyListener {
    JLabel label;

    Main() {
        label = new JLabel();

        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - 10, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - 10);
            case 'd' -> label.setLocation(label.getX() + 10, label.getY());
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - 10, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY() - 10);
            case 39 -> label.setLocation(label.getX() + 10, label.getY());
            case 40 -> label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("You released key char: "+ e.getKeyChar());
//        System.out.println("You released key code: "+ e.getKeyCode());
    }

    public static void main(String[] args) {
        new Main();
    }
}