package io.codelex.solidexamples;

import java.util.regex.Pattern;

import static org.apache.logging.log4j.util.Strings.isBlank;

class PersonValidator extends ObjectValidator {

    @Override
    void validator(Object o) {
        super.validator(o);
        Person person = (Person) o;
        if (isBlank(person.getName())
                || isBlank(person.getSurname())
                || isBlank(person.getIdentificationNumber())
                || person.getIdentificationNumber().contains(" ")
                || Pattern.compile("[0-9]").matcher(person.getName()).find()
                || Pattern.compile("[0-9]").matcher(person.getSurname()).find()
                || !Pattern.compile("[0-9]").matcher(person.getIdentificationNumber()).find()) {
            throw new IllegalArgumentException("Input not valid");
        }
    }

}
