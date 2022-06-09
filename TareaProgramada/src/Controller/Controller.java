package Controller;

import Model.mainModel;
import Vistas.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class Controller implements ActionListener {
    MainView mv;
    mainModel mm;
    
    public Controller(MainView mv, mainModel mm) {
        this.mv = mv;
        this.mm = mm;
        this.mv.start_btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(mv.start_btn)) {
            mm.runAnimation();
        }
    }

    public mainModel getMm() {
        return mm;
    }

    public MainView getMv() {
        return mv;
    }
    
}
