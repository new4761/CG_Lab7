import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.geom.AffineTransform;

class Lab7_60050143 extends JPanel {

    public static void main(String[] args) {
        Lab7_60050143 m = new Lab7_60050143();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Lab7");
        f.setBackground(Color.WHITE);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // rotation
        double r = Math.toRadians(30);
        g2.setTransform(new AffineTransform(Math.cos(r), Math.sin(r), 200, -Math.sin(r), Math.cos(r), 200));
        g2.drawRect(200, 200, 200, 200);

    }

}
