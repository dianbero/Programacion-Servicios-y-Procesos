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
        if (recursos.getLista().size() == 10) {
            controlador.doWait("PRODUCTOR");
        } else {
            for (int i = 0; i < 10; i++) {
                num = random.nextInt(10);
                recursos.getLista().add(num);
                System.out.println("Productor ha generado nuevo número: " + num);
                System.out.println("Tamaño del array: " + recursos.getLista().size());
                controlador.doNotify("PRODUCTOR"); //Notifica que ha producido
            }
        }
    }
}
