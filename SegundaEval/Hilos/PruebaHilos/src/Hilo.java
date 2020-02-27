public class Hilo implements Runnable {
    int repeticion = 0;

    public void run() {
        while (repeticion!=11){
            System.out.println("Repetición : " + repeticion);
            repeticion++;
//            Para que se ejecute cada segundo
//            try {
//                Thread.sleep(1000);
//                System.out.println("\nHa pasado un segundo\n");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
