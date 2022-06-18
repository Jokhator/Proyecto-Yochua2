package Controller;

import Model.mainModel;
import Vistas.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Marco Zumbado Solorzano C18736 Joshua Sancho Mora C17337 Luis Hodgson
 * Quesada C17337
 * @date 2021-08-16
 * @time 10:13:20
 */
//Se crea la clase controller implementando el action listener que va a ser usado en la vista principal.
public class Controller implements ActionListener {

    //Se instancian la vista y el modelo.
    MainView mv;
    mainModel mm;

    //Constructor.
    public Controller(MainView mv, mainModel mm) {
        this.mv = mv;
        this.mm = mm;
        this.mv.start_btn.addActionListener(this);
    }

    //Metodo implementado del actionListener.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(mv.start_btn)) {
            mm.runAnimation();
        }
    }

    //Metodos get.
    public mainModel getMm() {
        return mm;
    }

    public MainView getMv() {
        return mv;
    }

}
