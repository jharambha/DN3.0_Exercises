package main;

import context.PaymentContext;
import strategy.CreditCardPayment;
import strategy.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

       
        context.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23"));
        context.pay(100.00);

        
        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com", "password123"));
        context.pay(150.00);
    }
}
