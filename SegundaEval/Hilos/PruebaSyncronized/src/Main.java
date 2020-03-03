public class Main {
    public static void main(String[] args) {
        //Aquí van las llamadas a start() etc
        Recursos recursos = new Recursos();
        Runnable productor = new Productor(recursos);
        Thread hiloProductor = new Thread(productor);

        Thread hiloConsumidor = new Thread();
    }
}
