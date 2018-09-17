package HelloWorld;

import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Hello world");
        
        List v = new ArrayList();
        while (true)
        {
            byte b[] = new byte[10485760];
            v.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.println( "free memory: " + rt.freeMemory() + " max: " + rt.maxMemory());
            Thread.sleep(1000);
        }
    }
}
