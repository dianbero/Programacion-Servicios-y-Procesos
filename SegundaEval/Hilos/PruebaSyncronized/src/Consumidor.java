public class Consumidor implements Runnable {
    //clase para consumir recursos que genera el Productor
    Recursos recursos = null;

    public Consumidor(Recursos recursos) {
        this.recursos = recursos;
    }

    @Override
    public void run() {
        for (int i = 0; i < recursos.lista.size(); i++) {
            System.out.println(recursos.lista.get(i));
        }
    }
}
