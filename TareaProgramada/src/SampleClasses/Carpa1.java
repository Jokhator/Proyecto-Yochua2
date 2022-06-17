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
            while (images.size() >= 1) {
                try {
                    for (int i = 0; i < 250; i++) {
                        panel.animate(mainModel.cantPacientesAnim);
                    }
                    images.wait(5000);
                    mainModel.cantPacientesAnim--;
                    if (mainModel.cantPacientes == images.size()) {
                        mainModel.cantPacientes--;
                        mainModel.cantPacientes--;
                    } else if (mainModel.cantPacientes == -1) {
                        mainModel.cantPacientes += 1;
                    }
                    if (mainModel.cantPacientes <= images.size() && mainModel.cantPacientes >= 0) {
                        panel.vacunar(mainModel.cantPacientes);
                        mainModel.cantPacientes++;
                    }else{
                        mainModel.cantPacientes++;
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carpa1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
