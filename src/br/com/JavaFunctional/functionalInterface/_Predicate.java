package br.com.JavaFunctional.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));

        System.out.println("PREDICATE");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("070300000000"));

        System.out.println("TWO PREDICATES");
        boolean testAnd = isPhoneNumberValidPredicate.and(containsNumber3).test("07003000000");
        boolean testOr = isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000");
        System.out.println(testAnd);
        System.out.println(testOr);
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
