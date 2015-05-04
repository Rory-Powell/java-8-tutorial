package demo.lambdas;


import java.util.ArrayList;
import java.util.List;

public class DemoDefault
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        list.forEach(String::toUpperCase);

        for (String s : list)
            System.out.println(s);
    }

}
