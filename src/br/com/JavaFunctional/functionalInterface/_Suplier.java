package br.com.JavaFunctional.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Suplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionSupplier.get());
        System.out.println(getDBConnectionListSupplier.get());
    }

    static Supplier<String> getDBConnectionSupplier = () ->
            "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionListSupplier = () ->
            List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer"
                    );

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
