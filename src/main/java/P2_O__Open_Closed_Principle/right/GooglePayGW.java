package main.java.P2_O__Open_Closed_Principle.right;

public class GooglePayGW implements IPaymentGateway {
    public void pay(String googleAccountAuthenticated){}

    public void pay(String shoppingCart, String creditCard) {

    }

    @Override
    public void pay(String... paymentDetails) {

    }
    /**
     * Card number
     * MastercardVisa
     * Card number is required
     *
     * MM
     * Month is required
     *
     * /
     * YY
     * Year is required
     *
     * CVC
     */

}
