package SampleClasses;

import Vistas.AnimationFrame;
import Vistas.AnimationPanel;
import java.awt.Frame;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prueba.main;

/**
 * @author Luis Edo. Hodgson C13822
 * @time 8:13:20 PM
 * @date Jun 8, 2022
 */
public class Carpa1 implements Runnable {

    AnimationFrame frame;
    AnimationPanel panel;
    ArrayList<Image> images;

    public Carpa1(AnimationFrame frame) {
        this.frame = frame;
        this.panel = frame.getPanel();
        this.images = panel.getImages();
    }

    public void run() {
        synchronized (images) {
            int cantPacientes = 0;
            while(images.size() != 0){
                try {
                    images.wait(5000);
                    if (cantPacientes <= images.size()) {
                        panel.vacunar(cantPacientes);
                    }
                    panel.animate();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carpa1.class.getName()).log(Level.SEVERE, null, ex);
                }
                cantPacientes ++;
            }
        }
    }
}
