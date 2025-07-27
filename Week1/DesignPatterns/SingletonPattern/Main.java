public class Main
{
    public static void main(String[] args)
    {
        Logger log1 = Logger.getLogger();
        Logger log2 = Logger.getLogger();
        log1.log("This is the first log message");
        log2.log("This is the second log message");
        if(log1 == log2)
        {
            System.out.println("log1 is the same as log2 (Singleton success.......)");
        }
        else
        {
            System.out.println("log2 and log2 are different (Singleton failed...)");
        }
    }
}