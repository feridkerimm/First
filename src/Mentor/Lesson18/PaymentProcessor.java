package Mentor.Lesson18;

public class PaymentProcessor {

    public void processPayment(double amount) throws PaymentProcessingException {
        if (Math.random() > 0.1) {
            System.out.println("Payment of $" + amount + " processed successfully.");
        } else {
            throw new PaymentProcessingException("Payment processing failed.");
        }
    }
}
