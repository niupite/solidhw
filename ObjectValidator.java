package io.codelex.solidexamples;

abstract class ObjectValidator {

    void validator(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("Input not valid");
        }
    }

}
