package br.com.JavaFunctional.combinatorPattern;

import java.time.LocalDate;

import static br.com.JavaFunctional.combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer custumer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0932032323",
                LocalDate.of(2010, 1, 1)
        );

//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isValid(custumer));

//        System.out.println(new CustomerValidatorService().isValid(custumer));
        //Using combinator pattern
        ValidationResult result =
                 isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(custumer);

//        System.out.println(result);
//
//        if (result != ValidationResult.SUCESS) {
//            throw new IllegalStateException(result.name());
//        }
    }
}
