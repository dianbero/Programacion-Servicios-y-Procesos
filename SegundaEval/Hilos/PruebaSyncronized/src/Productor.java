import java.util.Random;

public class Productor implements Runnable {
    //clase para producir recursos

    public Recursos recursos = null;

    public Productor(Recursos recursos) {
        this.recursos = recursos;
    }

    @Override
    public void run() {
        Random random = new Random();
        int num;
        for (int i = 0; i < 10; i++) {
            num = random.nextInt(10);
            recursos.lista.add(num);
            System.out.println("Productor ha generado nuevo número: " + num);
        }
    }
}
