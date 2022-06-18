package SampleClasses;

import Model.mainModel;
import Vistas.AnimationFrame;
import Vistas.AnimationPanel;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import prueba.main;

/**
 * @author Marco Zumbado Solorzano C18736 Joshua Sancho Mora C17337 Luis Hodgson
 * Quesada C17337
 * @date 2021-08-16
 * @time 10:13:20
 */
//Sample class de la segunda carpa.
public class Carpa2 implements Runnable {

    //Se inicializan el frame, el panel y la lista con las imagenes de los pacientes.
    AnimationFrame frame;
    AnimationPanel panel;
    ArrayList<Image> images;

    //Constructor.
    public Carpa2(AnimationFrame frame) {
        this.frame = frame;
        this.panel = frame.getPanel();
        this.images = panel.getImages();
    }

    //Metodo main de la clase el cual anima a los pacientes hacia la segunda carpa.
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
