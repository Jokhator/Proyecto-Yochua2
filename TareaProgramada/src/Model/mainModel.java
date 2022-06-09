package Model;


import SampleClasses.Carpa;
import Vistas.AnimationFrame;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class mainModel {
    
    
    AnimationFrame obj = new AnimationFrame();
    Carpa carpa1 = new Carpa(obj);
    Thread thread = new Thread(obj);
    Thread tCarpa1 = new Thread(carpa1);

    public void runAnimation() {
        obj.setVisible(true);
        thread.start();
        tCarpa1.start();
    }

    public Thread getThread() {
        return thread;
    }

    public Thread gettCarpa1() {
        return tCarpa1;
    }

    public AnimationFrame getObj() {
        return obj;
    }
    

    
    
    
}
