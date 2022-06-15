package SampleClasses;

/**
 * @author Luis Edo. Hodgson C13822
 * @time 8:56:27 PM
 * @date Jun 13, 2022
 */
import java.util.List;

public class Consumer implements Runnable {

    List<String> productos;

    public Consumer(List<String> p) {
        productos = p;
    }
    
    
    public void run() {
        synchronized (productos) {

            if (productos.size() == 0) {
                try {
                    System.out.println("Hilo: " + Thread.currentThread().getName()
                            + " Esta en espera wait() ");
                    productos.wait();
                    System.out.println("A- Se desperto el hilo: " + Thread.currentThread().getName()
                            + " Consumio: " + productos.get(productos.size() - 1));
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

            while (productos.size() < 10) {
                try {
                    productos.wait();
                    System.out.println("B - Se desperto el hilo: " + Thread.currentThread().getName()
                            + " Consumio: " + productos.get(productos.size() - 1));
                } catch (Exception e) {
                    System.out.println("Consumer Error: " + e);
                }
            }

        }
    }
}
