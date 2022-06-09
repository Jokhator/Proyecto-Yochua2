package Vistas;

import javax.swing.JFrame;

/**
 * @author Marco Zumbado Solorzano carne C18736
 * @date 2021-08-16 
 * @time 10:13:20
*/
public class AnimationFrame extends JFrame implements Runnable {
    AnimationPanel panel;

    public AnimationFrame() {
        panel = new AnimationPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        panel.initialize();
    }

    @Override
    public void run() {
        boolean x = true;
        while (x == true) {            
            panel.animate();
        }
    }
    
    
}
