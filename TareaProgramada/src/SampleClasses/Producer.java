package SampleClasses;

import java.util.List;

/**
 * @author Luis Edo. Hodgson C13822
 * @time 9:31:45 PM
 * @date Jun 13, 2022
 */
public class Producer implements Runnable {

    private List<String> productos;

    public Producer(List<String> p) {
        productos = p;
    }

    public void run() {
        System.out.println("Productor se inicia....");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);

                synchronized (productos) {
                    System.out.println("Se agrego producto: " + i);
                    productos.add(String.valueOf(i));

                    productos.notifyAll();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
