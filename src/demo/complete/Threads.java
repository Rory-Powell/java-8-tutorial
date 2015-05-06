package demo.complete;

public class Threads
{
    public static void main(String[] args)
    {
        // Without lambda
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        });
        t1.run();

        // With lambda
        Thread t2 = new Thread(() -> System.out.println("Hello lambda!"));
        t2.run();
    }
}
