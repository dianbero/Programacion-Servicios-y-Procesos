import java.util.Random;

public class Controlador {
    //clase para los notify etc
    //Implementar clase
    Object monitoredObject = new Object();
    Random random = new Random();
    int tiempoEsperaRandom = random.nextInt(5);

    boolean haSidoNotificado = false;

    public void doNotify() {
        synchronized (monitoredObject) {
            haSidoNotificado = true;
            monitoredObject.notify();
            System.out.println("El productor ha notificado");
        }
    }

    public void doWait() {
        synchronized (monitoredObject) {
            while (!haSidoNotificado) {
                try {
                    monitoredObject.wait();
                    System.out.println("El consumidor está esperando");
                    Thread.sleep(tiempoEsperaRandom);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                haSidoNotificado = false;
            }
        }
    }

}
