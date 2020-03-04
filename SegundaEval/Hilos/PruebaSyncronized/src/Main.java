public class Main {
    public static void main(String[] args) {
        //Aquí van las llamadas a start() etc
        Recursos recursos = new Recursos();
        Controlador controlador = new Controlador();

        Runnable productor = new Productor(recursos, controlador);
        Thread hiloProductor = new Thread(productor);

        Runnable consumidor = new Consumidor(recursos, controlador);
        Thread hiloConsumidor = new Thread(consumidor);


        hiloProductor.start();
        hiloConsumidor.start();
    }
}
