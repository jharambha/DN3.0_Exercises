package main;

import payment.PaymentProcessor;
import adapter.PayPalAdapter;
import adapter.StripeAdapter;
import adapter.SquareAdapter;
import gateway.PayPal;
import gateway.Stripe;
import gateway.Square;

public class Main {
    public static void main(String[] args) {
       
        PayPal payPal = new PayPal();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        payPalProcessor.processPayment(50.0);

       
        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(100.0);
  // Use Square Adapter
        Square square = new Square();
        PaymentProcessor squareProcessor = new SquareAdapter(square);
        squareProcessor.processPayment(75.0);
    }
}

