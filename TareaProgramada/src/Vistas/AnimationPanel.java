package Vistas;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import prueba.main;

/**
 * @author Marco Zumbado Solorzano C18736 Joshua Sancho Mora C17337 Luis Hodgson
 * Quesada C17337
 * @date 2021-08-16
 * @time 10:13:20
 */
//Clase vista del animationPanel.
public class AnimationPanel extends JPanel {

    //Size del panel y listas que van a ser usadas.
    private final int Panel_Width = 1250;
    private final int Panel_Height = 1250;
    ArrayList<Image> images = new ArrayList<>();
    ArrayList<Integer> xVelocity = new ArrayList<>();
    ArrayList<Integer> yVelocity = new ArrayList<>();
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();

    //Constructor.
    public AnimationPanel() {
        this.setPreferredSize(new Dimension(Panel_Width, Panel_Height));
        this.setBackground(Color.BLACK);

    }

    //Metodo para inicializar el panel.
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

    //Metodo para "pintar" los pacientes en el panel.
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(new ImageIcon("carpa1.png").getImage(), 200, 100, this);
        g2d.drawImage(new ImageIcon("carpa2.png").getImage(), 750, 100, this);
        g2d.drawImage(new ImageIcon("salida.png").getImage(), 1000, 100, this);
        for (int i = 0; i != images.size(); i++) {
            if (images.get(i) != null) {
                g2d.drawImage(images.get(i), x.get(i), y.get(i), this);
            }
        }
    }

    //Metodo para animar los pacientes hacia las carpas..
    public void animate(int pac, String carpa) {

        if (carpa.equals("carpa1")) {
            if (x.get(pac) > 286) {
                x.set(pac, x.get(pac) - xVelocity.get(pac));
            } else if (x.get(pac) < 286) {
                x.set(pac, x.get(pac) + xVelocity.get(pac));
            } else if (x.get(pac) == 286) {
                if (y.get(pac) != 228) {
                    y.set(pac, y.get(pac) - yVelocity.get(pac));
                }
            }
            try {
                main.controller.getMm().gettCarpa1().sleep(4);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            repaint();
        } else {
            if (x.get(pac) > 835) {
                x.set(pac, x.get(pac) - xVelocity.get(pac));
            } else if (x.get(pac) < 835) {
                x.set(pac, x.get(pac) + xVelocity.get(pac));
            } else if (x.get(pac) == 835) {
                if (y.get(pac) != 228) {
                    y.set(pac, y.get(pac) - yVelocity.get(pac));
                }
            }
            try {
                main.controller.getMm().gettCarpa2().sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            repaint();
        }
    }

    //Metodo para salir de la carpa.
    public void salir(int pac, String carpa) {

        if (carpa.equals("carpa1")) {
            if (x.get(pac) < 1250) {
                x.set(pac, x.get(pac) + xVelocity.get(pac));
            }
            try {
                main.controller.getMm().gettCarpa1().sleep(4);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            repaint();
        } else {
            if (x.get(pac) < 1250) {
                x.set(pac, x.get(pac) + xVelocity.get(pac));
            }
            try {
                main.controller.getMm().gettCarpa1().sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(AnimationPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            repaint();
        }

    }

    //Metodo que vacuna al paciente, generando que se vaya para su casa.
    public void vacunar(int num) {
        images.remove(num);
        repaint();
    }

    //Metodo para obtener las imagenes de los pacientes.
    public ArrayList<Image> getImages() {
        return images;
    }

}
