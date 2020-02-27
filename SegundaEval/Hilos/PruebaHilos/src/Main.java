public class Main {

    public static void main(String[] args) {
        Runnable runnable = new Hilo();
        Thread hilo = new Thread(runnable);
        System.out.println("Hilo 1: ");
        hilo.start();
        //Pasados dos segundos se ejecuta el siguiente hilo
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Runnable run2 = new Hilo();
        Thread hilo2 = new Thread(run2);
        hilo2.start();
        System.out.println("Hilo 2:");

    }
}
