package Model;

import Vistas.AnimationFrame;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class mainModel {

    AnimationFrame obj = new AnimationFrame();
    Thread thread = new Thread(obj);

    public void runAnimation() {
        obj.setVisible(true);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }
    
    
}
