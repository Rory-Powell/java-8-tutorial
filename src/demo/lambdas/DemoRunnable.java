package demo.lambdas;

public class DemoRunnable
{
    public static void main(String[] args)
    {
        // Without Lambda
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        });
        t1.run();

        // With Lambda


    }
}
