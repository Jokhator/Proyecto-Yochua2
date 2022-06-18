package Vistas;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import prueba.main;

/**
 * @author Marco Zumbado Solorzano C18736 Joshua Sancho Mora C17337 Luis Hodgson
 * Quesada C17337
 * @date 2021-08-16
 * @time 10:13:20
 */
//Clase vista para el animationFrame.
public class AnimationFrame extends JFrame implements Runnable {

    //Se inicializa el panel que contiene a la lista de las imagenes de todos los pacientes.
    private AnimationPanel panel;
    ArrayList<Image> images;

    //Constructor.
    public AnimationFrame() {
        panel = new AnimationPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        panel.initialize();
        this.images = panel.getImages();
    }

    //Metodo main de la clase el  cual obtiene las imagenes de los pacientes hasta cierto limite.
    @Override
    public void run() {
        synchronized (images) {
            while (images.size() != 50) {
                images.add(new ImageIcon("paciente.png").getImage());
                images.notifyAll();
                panel.repaint();
            }
            main.controller.getMm().gettCarpa1().start();
            main.controller.getMm().gettCarpa2().start();
            main.controller.getMm().getThread().stop();
        }
    }

    //Unico metodo get de la clase.
    public AnimationPanel getPanel() {
        return panel;
    }

}
