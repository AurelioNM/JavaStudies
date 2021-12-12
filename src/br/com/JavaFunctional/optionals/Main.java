package br.com.JavaFunctional.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        value -> System.out.println("Sending email to " + value),
                        () -> System.out.println("Cannot send email"));

    }
}
