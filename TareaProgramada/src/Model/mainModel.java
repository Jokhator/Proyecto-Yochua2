package Model;

import SampleClasses.Carpa1;
import SampleClasses.Carpa2;
import Vistas.AnimationFrame;

/**
 * @author Marco Zumbado Solorzano C18736 Joshua Sancho Mora C17337 Luis Hodgson
 * Quesada C17337
 * @date 2021-08-16
 * @time 10:13:20
 */
//Clase modelo.
public class mainModel {

    //Variables, instancias y threads utilizados en la clase.
    public static int cantPacientes = 0;
    private int cantPacientesAnim = 49;
    AnimationFrame obj = new AnimationFrame();
    Carpa1 carpa1 = new Carpa1(obj);
    Carpa2 carpa2 = new Carpa2(obj);
    Thread thread = new Thread(obj);
    Thread tCarpa1 = new Thread(carpa1);
    Thread tCarpa2 = new Thread(carpa2);

    //Metodo para correr la animation.
    public void runAnimation() {
        obj.setVisible(true);
        thread.start();
    }

    //Unico metodo set de la clase.
    public void setCantPacientesAnim(int cantPacientesAnim) {
        this.cantPacientesAnim = cantPacientesAnim;
    }

    //Metodos get.
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
