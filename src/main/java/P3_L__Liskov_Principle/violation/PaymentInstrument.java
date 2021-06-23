package main.java.P3_L__Liskov_Principle.violation;

import main.java.P3_L__Liskov_Principle.FraudDetectedException;
import main.java.P3_L__Liskov_Principle.PaymentFailedException;
import main.java.P3_L__Liskov_Principle.PaymentInstrumentInvalidException;
import java.util.Date;

abstract class PaymentInstrument {

    String name;
    String cardNumber;
    String verificationCode;
    Date expiryDate;
    String fingerprint;

    void validate() throws PaymentInstrumentInvalidException {
        // basic validation on name, expiryDate etc.
        if (name == null || name.isEmpty()) {
            throw new PaymentInstrumentInvalidException("Name is invalid");
        }
        // other validations
    }

    void runFraudChecks() throws FraudDetectedException {
        // run checks against a third-party system
    }

    void sendToPaymentGateway() throws PaymentFailedException {
        // send details to payment gateway (PG) and set fingerprint from
        // the payment gateway response
    }

}
