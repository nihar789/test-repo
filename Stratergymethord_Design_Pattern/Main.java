package Stratergymethord_Design_Pattern;

// Client Code
public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Method Design Pattern - Behavioral DP");

        // Without Strategy Pattern
        Payments payments = new Payments();
        payments.setPaymentType(Payments.PaymentType.Cash);
        payments.process(100);

        payments.setPaymentType(Payments.PaymentType.Cards);
        payments.process(200);

        payments.setPaymentType(Payments.PaymentType.UPI);
        payments.process(300);

        // With Strategy Pattern
        PaymentUsingStrategy paymentUsingStrategy = new PaymentUsingStrategy(new CardPaymentConcreteStrategy());
        paymentUsingStrategy.process(100);

        paymentUsingStrategy = new PaymentUsingStrategy(new CashPaymentConcreteStrategy());
        paymentUsingStrategy.process(200);

        paymentUsingStrategy = new PaymentUsingStrategy(new UPIPaymentConcreteStrategy());
        paymentUsingStrategy.process(300);
    }
}