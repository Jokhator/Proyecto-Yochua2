package prueba;

import Controller.Controller;
import Model.mainModel;
import Vistas.MainView;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class main {
    public static Controller controller;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainView view = new MainView();
        view.setTitle("Sum two numbers with MVC Swing");
        view.setLocationRelativeTo(null);
        mainModel model = new mainModel();
        view.setVisible(true);
        controller = new Controller(view, model);
    }

}
