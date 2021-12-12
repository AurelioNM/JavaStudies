package br.com.JavaFunctional.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "9821040");

        greetCustomer(maria);

        //Consumer Functional Interface
        greetCustomerConsumer.accept(maria);

        greetCustomerBiConsumer.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for regestering phone number " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNUmber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for regestering phone number " +
                    (showPhoneNUmber ? customer.customerPhoneNumber : "*******"));


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for regestering phone number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
