package demo;

public class Runnable
{
    public static void main(String[] args)
    {

        Thread t1 = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        });
        t1.run();

        Thread t2 = new Thread(() -> System.out.println("Hello lambda!"));
        t2.run();
    }
}
