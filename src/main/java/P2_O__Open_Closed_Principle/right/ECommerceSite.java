package main.java.P2_O__Open_Closed_Principle.right;

/**
 * https://www.baeldung.com/java-liskov-substitution-principle
 * Consequently, the ECommerceSite is open for the extension with new account types,
 * but closed for modification, in that the new types don't require it to change in order to integrate.
 */
public class ECommerceSite {

    // https://codecoach.co.nz/the-open-closed-principle/
   // PaymentGateway.Pay(shoppingCart, creditCard);

    String cardNumber, expirationDate, CVV;

    IPaymentGateway payment = new GooglePayGW();

    public void performPayment(){
        payment.pay(cardNumber, expirationDate, CVV);
    }

}
