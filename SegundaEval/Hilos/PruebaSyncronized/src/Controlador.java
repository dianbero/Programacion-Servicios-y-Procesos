import java.util.Random;

public class Controlador {
    //clase para los notify etc
    //Implementar clase
    Object monitoredObject = new Object();
    Random random = new Random();
    int tiempoEsperaRandom;

    boolean haSidoNotificado = false;

    public void doNotify(String nombre) {
        synchronized (monitoredObject) {
            haSidoNotificado = true;
            tiempoEsperaRandom = random.nextInt(8);
            try {
                Thread.sleep(tiempoEsperaRandom);
                monitoredObject.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("El " + nombre + " ha notificado");
        }
    }

    public void doWait(String nombre) {
        synchronized (monitoredObject) {
            while (!haSidoNotificado) {
                try {
                    monitoredObject.wait();
                    System.out.println("El " + nombre + " está esperando");
                    Thread.sleep(tiempoEsperaRandom);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                haSidoNotificado = false;
            }
        }
    }
}
