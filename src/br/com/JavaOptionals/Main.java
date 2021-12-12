package br.com.JavaOptionals;

import java.util.Locale;
import java.util.Optional;

//  https://medium.com/@racc.costa/optional-no-java-8-e-no-java-9-7c52c4b797f1

public class Main {
    public static void main(String[] args) {

//        Optional<String> hello = Optional.ofNullable("hello");
//
//        System.out.println(hello.isPresent());
//        System.out.println(hello.isEmpty());
//
//        hello.ifPresentOrElse(System.out::println, () -> {
//            System.out.println("world");
//        });

        Person person = new Person("James", "AURELIO@gmail.com");


        String email = person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email not provided");

        System.out.println(email);


        if (person.getEmail().isPresent()) {
            String email2 = person.getEmail().get();
            System.out.println(email2.toLowerCase());
        } else {
            System.out.println("email not provided");
        }
    }
}
class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
