package backup.lambdas;

public class RunnableDemo
{
    public static void main(String[] args)
    {
       // Without lambda
       Runnable r = new Runnable() {
          @Override
          public void run() {
             System.out.println("Hello!");
          }
       };
       r.run();

       // With Lambda
       Runnable r1 = () -> System.out.println("Hello without lambda");
       r1.run();
    }

}
