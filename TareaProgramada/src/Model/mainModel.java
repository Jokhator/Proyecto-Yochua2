package Model;

import SampleClasses.Carpa1;
import SampleClasses.Carpa2;
import Vistas.AnimationFrame;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16
 * @time 10:13:20
 */
public class mainModel {

    public static int cantPacientes = 0;
    private int cantPacientesAnim = 49;
    AnimationFrame obj = new AnimationFrame();
    Carpa1 carpa1 = new Carpa1(obj);
    Carpa2 carpa2 = new Carpa2(obj);

    Thread thread = new Thread(obj);
    Thread tCarpa1 = new Thread(carpa1);
    Thread tCarpa2 = new Thread(carpa2);

    public void runAnimation() {
        obj.setVisible(true);
        thread.start();
    }

    public void setCantPacientesAnim(int cantPacientesAnim) {
        this.cantPacientesAnim = cantPacientesAnim;
    }

    public Thread getThread() {
        return thread;
    }

    public int getCantPacientesAnim() {
        return cantPacientesAnim;
    }

    public Thread gettCarpa1() {
        return tCarpa1;
    }

    public Thread gettCarpa2() {
        return tCarpa2;
    }

    public AnimationFrame getObj() {
        return obj;
    }

}
