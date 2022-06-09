package SampleClasses;

import Vistas.AnimationFrame;
import Vistas.AnimationPanel;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import prueba.main;

/**
 * @author Luis Edo. Hodgson C13822
 * @time 8:13:20 PM
 * @date Jun 8, 2022
 */
public class Carpa implements Runnable {

    AnimationFrame frame;
    AnimationPanel panel;

    public Carpa(AnimationFrame frame) {
        this.frame = frame;
        this.panel = frame.getPanel();
    }
    
    public void run() {
        for (int i = 49; i != -1; i--) {
            try {
                main.controller.getMm().gettCarpa1().sleep(500);
                panel.vacunar(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Carpa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
