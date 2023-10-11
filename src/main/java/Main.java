import static java.lang.Thread.sleep;

public class Main {


    public static void main(String[] args) {
        Thread thread = new Thread(task);
            thread.start();
            while (true){
                System.out.println("Работает основная программа");
                 try {
                     sleep(10000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
            }
    }

    static Runnable task = () -> {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Асинхронный привет!");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Асинхронный пока!");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };
}

