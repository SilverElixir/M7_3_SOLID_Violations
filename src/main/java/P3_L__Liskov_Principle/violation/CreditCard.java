package main.java.P3_L__Liskov_Principle.violation;

import main.java.P3_L__Liskov_Principle.PaymentInstrumentInvalidException;

public class CreditCard extends PaymentInstrument {

    @Override
    void validate() throws PaymentInstrumentInvalidException {
        super.validate();
        // additional validations for credit cards
    }
    // other credit card-specific code
}
