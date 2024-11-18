package SOLID.OCP;

class PaymentProcessor {

    public void processPayment(Payment payment) {
        if (payment instanceof CreditCardPayment) {
            processCreditCardPayment((CreditCardPayment) payment);
        } else if (payment instanceof PayPalPayment) {
            processPayPalPayment((PayPalPayment) payment);
        } else if (payment instanceof BankTransferPayment) {
            processBankTransferPayment((BankTransferPayment) payment);
        } else {
            System.out.println("Unknown payment type.");
        }
    }

    private void processCreditCardPayment(CreditCardPayment payment) {
        System.out.println("Processing credit card payment.");
        // Add specific logic for credit card payment
    }

    private void processPayPalPayment(PayPalPayment payment) {
        System.out.println("Processing PayPal payment.");
        // Add specific logic for PayPal payment
    }

    private void processBankTransferPayment(BankTransferPayment payment) {
        System.out.println("Processing bank transfer payment.");
        // Add specific logic for bank transfer payment
    }
}

// Base class for payments
abstract class Payment {}

// Subclass for Credit Card Payments
class CreditCardPayment extends Payment {}

// Subclass for PayPal Payments
class PayPalPayment extends Payment {}

// Subclass for Bank Transfer Payments
class BankTransferPayment extends Payment {}



// Usage Example
public class OCPVoilation {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
       
        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();
        Payment bankTransfer = new BankTransferPayment();

        processor.processPayment(creditCard);
        processor.processPayment(payPal);
        processor.processPayment(bankTransfer);
    }
}