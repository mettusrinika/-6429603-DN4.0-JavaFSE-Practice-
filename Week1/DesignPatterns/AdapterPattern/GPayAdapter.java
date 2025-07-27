public class GPayAdapter implements Payment
{
    private GPay gPay;
    public GPayAdapter(GPay gPay)
    {
        this.gPay = gPay;
    }
    public void processPayment(double amt)
    {
        gPay.sendPayment(amt);
    }
}
