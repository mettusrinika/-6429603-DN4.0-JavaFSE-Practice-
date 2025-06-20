public class Logger
{
    private static Logger log = null;
    private Logger()
    {
        System.out.println("Instance created for logger");
    }
    public static Logger getLogger()
    {
        if (log == null)
        {
            log = new Logger();
        }
        return log;
    }
    public void log(String message)
    {
        System.out.println("Log: "+ message);
    }
}