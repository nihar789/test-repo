package Stratergymethord_Design_Pattern;

// Concrete Strategies
class CardPaymentConcreteStrategy implements PaymentStrategy {
    public void process(double price) {
        System.out.println("Payment processing using card for $" + price);
    }
}

class CashPaymentConcreteStrategy implements PaymentStrategy {
    public void process(double price) {
        System.out.println("Payment processing using cash for $" + price);
    }
}

class UPIPaymentConcreteStrategy implements PaymentStrategy {
    public void process(double price) {
        System.out.println("Payment processing using UPI for $" + price);
    }
}