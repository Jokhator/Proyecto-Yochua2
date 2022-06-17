package SampleClasses;

import Model.mainModel;
import Vistas.AnimationFrame;
import Vistas.AnimationPanel;
import java.awt.Frame;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ButtonType;
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
            while (images.size() >= 3) {
                try {
                    int cantPacientesAnim1 = main.controller.getMm().getCantPacientesAnim();
                    int cantPacientesAnim2 = cantPacientesAnim1 - 1;
                    int cantPacientesAnim3 = cantPacientesAnim2 - 1;
                    main.controller.getMm().setCantPacientesAnim(main.controller.getMm().getCantPacientesAnim() - 3);

                    for (int i = 0; i <= 2000; i++) {
                        panel.animate(cantPacientesAnim1, "carpa2");
                        panel.animate(cantPacientesAnim2, "carpa2");
                        panel.animate(cantPacientesAnim3, "carpa2");
                    }

                    for (int i = 0; i < 1500; i++) {
                        panel.salir(cantPacientesAnim1, "carpa2");
                        panel.salir(cantPacientesAnim2, "carpa2");
                        panel.salir(cantPacientesAnim3, "carpa2");
                    }

                    for (int i = 0; i < 3; i++) {
                        if (images.size() >= 3) {
                            if (mainModel.cantPacientes == images.size()) {
                                mainModel.cantPacientes--;
                                mainModel.cantPacientes--;
                            }
                            if (mainModel.cantPacientes != images.size()) {
                                panel.vacunar(mainModel.cantPacientes);
                                mainModel.cantPacientes++;

                            }
                        }
                    }
                    images.wait(3000);
                    panel.repaint();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carpa2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
