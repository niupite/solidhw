package io.codelex.solidexamples;

import java.util.regex.Pattern;

import static org.apache.logging.log4j.util.Strings.isBlank;

class PersonValidator {

    void validator(Person person) {
        if (isBlank(person.getName())
                || isBlank(person.getSurname())
                || isBlank(person.getIdentificationNumber())
                || person.getIdentificationNumber().contains(" ")
                || Pattern.compile("[0-9]").matcher(person.getName()).find()
                || Pattern.compile("[0-9]").matcher(person.getSurname()).find()
                || !Pattern.compile("[0-9]").matcher(person.getIdentificationNumber()).find()) {
            throw new IllegalArgumentException("Person data is not valid");
        }
    }

}
