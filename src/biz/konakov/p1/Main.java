package biz.konakov.p1;


import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    int j;

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random(42);
        int orelCounter = 0, reshkaCounter = 0;

        while (true) {
            boolean result = rand.nextBoolean();
            if (result) {
                System.out.println("OREL-" + ++orelCounter);
            } else {
                System.out.println("RESHKA-" + ++reshkaCounter);
            }

            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}
