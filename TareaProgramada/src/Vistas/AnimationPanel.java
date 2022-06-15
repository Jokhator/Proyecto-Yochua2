package Vistas;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import prueba.main;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class AnimationPanel extends JPanel {

    private final int Panel_Width = 1250;
    private final int Panel_Height = 1250;
    ArrayList<Image> images = new ArrayList<>();
    ArrayList<Integer> xVelocity = new ArrayList<>();
    ArrayList<Integer> yVelocity = new ArrayList<>();
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();

    public AnimationPanel() {
        this.setPreferredSize(new Dimension(Panel_Width, Panel_Height));
        this.setBackground(Color.BLACK);

    }

    public void initialize() {
        int posicionx = 100;
        int posiciony = 900;
        for (int i = 0; i != 50; i++) {
            x.add(posicionx);
            y.add(posiciony);
            xVelocity.add(1);
            yVelocity.add(1);
            posicionx += 100;
            switch (i) {
                case 9:
                    posicionx = 100;
                    posiciony -= 100;
                    break;
                case 19:
                    posicionx = 100;
                    posiciony -= 100;
                    break;
                case 29:
                    posicionx = 100;
                    posiciony -= 100;
                    break;
                case 39:
                    posicionx = 100;
                    posiciony -= 100;
                    break;
                default:
                    break;
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i != images.size(); i++) {
            if (images.get(i) != null) {
                g2d.drawImage(images.get(i), x.get(i), y.get(i), this);
            }
        }
    }

    public void animate() {
//        
//        if (x.get(0) >= Panel_Width - images.get(0).getWidth(null) || x.get(0) < 0) {
//            xVelocity.set(0, xVelocity.get(0) * -1);
//        }
//        x.set(0, x.get(0) - xVelocity.get(0));
        try {
            main.controller.getMm().getThread().sleep(10);
        } catch (InterruptedException ex) {
            System.err.println("Error");
        }
        repaint();
    }

    public void vacunar(int num) {
        images.remove(num);
    }

    public ArrayList<Image> getImages() {
        return images;
    }
    
}
