package HelloWorld;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Hello world");
        
        Vector v = new Vector();
        while (true)
        {
            byte b[] = new byte[1048576];
            v.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.println( "free memory: " + rt.freeMemory() );
            Thread.sleep(400);
        }
        System.out.println("Hello world done");
    }
}
