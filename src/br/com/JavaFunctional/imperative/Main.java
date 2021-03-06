package br.com.JavaFunctional.imperative;

import java.util.List;

import static br.com.JavaFunctional.imperative.Main.Gender.*;


public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );

        List<Person> females = people.stream()
                .filter(person -> person.gender.equals(FEMALE))
                .toList();

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
