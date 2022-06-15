package SampleClasses;

import Model.mainModel;
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
public class Carpa2 implements Runnable {

    AnimationFrame frame;
    AnimationPanel panel;
    ArrayList<Image> images;

    public Carpa2(AnimationFrame frame) {
        this.frame = frame;
        this.panel = frame.getPanel();
        this.images = panel.getImages();
    }

    public void run() {
        synchronized (images) {
            while (images.size() != 0) {
                try {

                    images.wait(3000);
                    for (int i = 0; i < 3; i++) {
                        if (mainModel.cantPacientes <= images.size()-1) {
                            panel.vacunar(mainModel.cantPacientes);
                            mainModel.cantPacientes++;
                        }else{
                            mainModel.cantPacientes--;
                        }
                    }
                    panel.animate();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carpa2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
