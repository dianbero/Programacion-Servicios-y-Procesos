public class Main {
    public static void main(String[] args) {
        //Aquí van las llamadas a start() etc
        Recursos recursos = new Recursos();

        Runnable productor = new Productor(recursos/*poner Controlador*/);
        Thread hiloProductor = new Thread(productor);

        Runnable consumidor = new Consumidor(recursos);
        Thread hiloConsumidor = new Thread(consumidor);


        hiloProductor.start();
        hiloConsumidor.start();
    }
}
