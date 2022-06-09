package Vistas;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class AnimationPanel1 extends JPanel implements ActionListener {

    private final int Panel_Width = 1250;
    private final int Panel_Height = 500;
    private final Timer timer;
    private final ArrayList<Image> images = new ArrayList<>();
    private final ArrayList<Integer> xVelocity = new ArrayList<>();
    private final ArrayList<Integer> yVelocity = new ArrayList<>();
    private final ArrayList<Integer> x = new ArrayList<>();
    private final ArrayList<Integer> y = new ArrayList<>();

    public AnimationPanel1() {
        this.setPreferredSize(new Dimension(Panel_Width, Panel_Height));
        this.setBackground(Color.BLACK);
        timer = new Timer(100, this);
        timer.start();
    }

    public void initialize() {
        int posicion = 100;
        for (int i = 0; i <= 4; i++) {
            images.add(new ImageIcon("cliente" + i + ".jpg").getImage());
            x.add(posicion);
            y.add(250);
            xVelocity.add(1);
            yVelocity.add(1);
            posicion += 100;
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < 5; i++) {
            g2d.drawImage(images.get(i), x.get(i), y.get(i), this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x.set(0, x.get(0) + xVelocity.get(0));
        repaint();
        
    }

}
