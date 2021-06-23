package main.java.P2_O__Open_Closed_Principle.violation;

public class ECommerceSite {

    String paypalConfig = "https://www.paypal.com/us/webapps/mpp/paypal-credit";
    String stripeConfig = "https://stripe.com/docs/cli/config";

    PaypalPaymentGateway paypal= new PaypalPaymentGateway(paypalConfig);
    StripePaymentGateway stripe = new StripePaymentGateway(stripeConfig);
}
