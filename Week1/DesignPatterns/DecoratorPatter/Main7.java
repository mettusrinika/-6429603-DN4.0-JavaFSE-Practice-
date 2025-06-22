public class Main7
{
    public static void main(String[] args)
    {
        Notifier baseNotifier = new EmailNotifier();
        Notifier smsDecorator = new SMSNotifierDecorator(baseNotifier);
        Notifier slackDecorator = new SlackNotifierDecorator(smsDecorator);
        slackDecorator.send("System Maintenance........ Scheduled At 10-12 PM");
    }
}
