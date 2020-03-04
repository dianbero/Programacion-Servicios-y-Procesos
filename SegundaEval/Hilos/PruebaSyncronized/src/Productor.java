import java.util.Random;

public class Productor implements Runnable {
    //clase para producir recursos

    Recursos recursos = null;
    Controlador controlador;

    public Productor(Recursos recursos, Controlador controlador) {
        this.recursos = recursos;
        this.controlador = controlador;
    }

    @Override
    public void run() {
        Random random = new Random();
        int num;
        for (int i = 0; i < 10; i++) {
            num = random.nextInt(10);
            recursos.getLista().add(num);
            System.out.println("Productor ha generado nuevo número: " + num);
            controlador.doNotify(); //Notifica que ha producido
        }
    }
}
