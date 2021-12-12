package br.com.JavaStreams.AmigosCodeVideo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = getPeople();
/*
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
*/

//        Imperative approach  NOT
//        Declarative aproach  YES

//        Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

//        Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
                .collect(Collectors.toList());

//        All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 50);

//        Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() < 7);

//        None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("James Bond"));

//        Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

//        Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

//        Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach((gender, people1) -> {
//            System.out.println();
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
//        });

        Optional<String> oldestFemale = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemale.ifPresent(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
