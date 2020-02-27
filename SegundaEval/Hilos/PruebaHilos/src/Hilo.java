public class Hilo implements Runnable {
    private String nombreHilo;
    int repeticion = 0;
//
//    public Hilo(String nombreHilo){
//        this.nombreHilo = nombreHilo;
//    }


    public void run() {
        while (repeticion!=11){
            System.out.println("Repetición : " + repeticion);
            repeticion++;
//            try {
//                Thread.sleep(1000);
//                System.out.println("\nHa pasado un segundo\n");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

//    Getters and Setters
//
//    public String getNombreHilo() {
//        return nombreHilo;
//    }
//
//    public void setNombreHilo(String nombreHilo) {
//        this.nombreHilo = nombreHilo;
//    }
}
