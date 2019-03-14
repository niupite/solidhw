package io.codelex.solidexamples;

import java.util.regex.Pattern;

import static org.apache.logging.log4j.util.Strings.isBlank;

class AddressValidator extends ObjectValidator {

    @Override
    void validator(Object o) {
        super.validator(o);
        Address address = (Address) o;
        if (isBlank(address.getPostalCode())
                || isBlank(address.getCountry())
                || isBlank(address.getCity())
                || isBlank(address.getStreetName())
                || address.getStreetNumber() == null
                || address.getStreetNumber() == 0
                || !Pattern.compile("[0-9]").matcher(address.getPostalCode()).find()
                || Pattern.compile("[0-9]").matcher(address.getCountry()).find()
                || Pattern.compile("[0-9]").matcher(address.getCity()).find()
                || Pattern.compile("[0-9]").matcher(address.getStreetName()).find()) {
            throw new IllegalArgumentException("Input not valid");
        }
    }

}
