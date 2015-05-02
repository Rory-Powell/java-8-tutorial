package demo.lambdas;

public class Demo
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        });
        t1.run();

        Thread t2 = new Thread(() -> System.out.println("Hello!"));
        t2.run();

    }
}
