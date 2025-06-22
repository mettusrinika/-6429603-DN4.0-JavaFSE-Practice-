public class PhonePayAdapter implements Payment
{
    private PhonePay phonePay;
    public PhonePayAdapter(PhonePay phonePay) {
        this.phonePay = phonePay;
    }
    @Override
    public void processPayment(double amt)
    {
        phonePay.makePayment(amt);
    }
}
