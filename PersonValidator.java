package io.codelex.solidexamples;

import java.util.regex.Pattern;

import static org.apache.logging.log4j.util.Strings.isBlank;

class PersonValidator {

    void validator(Person person) {
        if (isBlank(person.getName())
                || isBlank(person.getSurname())
                || Pattern.compile("[0-9]").matcher(person.getName()).find()
                || Pattern.compile("[0-9]").matcher(person.getSurname()).find()) {
            throw new IllegalArgumentException("Name or surname is not valid");
        }
    }

}
