package Vistas;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        g2d.drawImage(new ImageIcon("carpa.png").getImage(), 200, 100, this);
        g2d.drawImage(new ImageIcon("carpa.png").getImage(), 750, 100, this);
        for (int i = 0; i != images.size(); i++) {
            if (images.get(i) != null) {
                g2d.drawImage(images.get(i), x.get(i), y.get(i), this);
            }
        }
    }

    public void animate(int pac) {
        switch (pac) {
            case 0:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                redraw();
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
            case 15:

                break;
            case 16:

                break;
            case 17:

                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

                break;
            case 21:

                break;
            case 22:

                break;
            case 23:

                break;
            case 24:

                break;
            case 25:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 26:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 27:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 28:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 29:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 30:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 31:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 32:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 33:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 34:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 35:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 36:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 37:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 38:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 39:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 40:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 41:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 42:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 43:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 44:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 45:
                x.set(0, x.get(0) - xVelocity.get(0));
                y.set(0, y.get(0) - yVelocity.get(0));
                break;
            case 46:
                x.set(46, x.get(46) - xVelocity.get(46));
                y.set(46, y.get(46) - yVelocity.get(46));
                try {
                    main.controller.getMm().gettCarpa2().sleep(4);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 47:
                x.set(47, x.get(47) - xVelocity.get(47));
                y.set(47, y.get(47) - yVelocity.get(47));
                try {
                    main.controller.getMm().gettCarpa2().sleep(4);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 48:
                x.set(48, x.get(48) - xVelocity.get(48));
                y.set(48, y.get(48) - yVelocity.get(48));
                try {
                    main.controller.getMm().gettCarpa2().sleep(4);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 49:
                x.set(49, x.get(49) - xVelocity.get(49));
                y.set(49, y.get(49) - yVelocity.get(49));
                try {
                    main.controller.getMm().gettCarpa1().sleep(4);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            default:
                throw new AssertionError();
        }
        redraw();
    }

    public void redraw() {

        repaint();
    }

    public void vacunar(int num) {
        images.remove(num);
    }

    public ArrayList<Image> getImages() {
        return images;
    }

}
