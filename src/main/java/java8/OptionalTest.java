package java8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> firstName = Optional.of("Tom");
        System.out.println("First Name is Set? " + firstName.isPresent());
        System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
        System.out.println();
    }
}
