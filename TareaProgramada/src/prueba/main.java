package prueba;

import Controller.Controller;
import Model.mainModel;
import Vistas.MainView;

/**
 * @author Marco Zumbado Solorzano C18736 Joshua Sancho Mora C17337 Luis Hodgson
 * Quesada C17337
 * @date 2021-08-16
 * @time 10:13:20
 */
//Clase main del programa.
public class main {

    //Se inicializa el controlador.
    public static Controller controller;

    //Metodo main.
    public static void main(String[] args) {
        //Inicializacion de la vista y el modelo.
        MainView view = new MainView();
        view.setTitle("CCSS");
        view.setLocationRelativeTo(null);
        mainModel model = new mainModel();
        view.setVisible(true);
        controller = new Controller(view, model);
    }

}
