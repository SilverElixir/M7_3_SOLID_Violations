package main.java.P2_O__Open_Closed_Principle.right;

public class Privat24GW implements IPaymentGateway {

    public Privat24GW(String paypalConfig){
    }

    public void pay(String paypalCart, String creditCard){}

    @Override
    public void pay(String... paymentDetails) {

    }
}
