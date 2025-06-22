public class Main6
{
    public static void main(String[] args)
    {
        GPay gPay = new GPay();
        Payment gp = new GPayAdapter(gPay);
        gp.processPayment(3000);

        PhonePay pp = new PhonePay();
        Payment p = new PhonePayAdapter(pp);
        p.processPayment(6000);
    }
}
