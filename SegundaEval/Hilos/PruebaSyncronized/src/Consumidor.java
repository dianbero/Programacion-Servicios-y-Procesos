public class Consumidor implements Runnable {
    //clase para consumir recursos que genera el Productor
    Recursos recursos = null;
    Controlador controlador = null;

    public Consumidor(Recursos recursos, Controlador controlador) {
        this.recursos = recursos;
        this.controlador = controlador;
    }

    @Override
    public void run() {
        if (recursos.getLista().size() > 0) {
            for (int i = 0; i < recursos.getLista().size(); i++) {
                System.out.println("Ha consumido: " + recursos.getLista().get(i));
                controlador.doNotify();
            }
        }
    }
}
