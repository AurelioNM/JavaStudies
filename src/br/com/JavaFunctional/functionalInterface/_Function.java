package br.com.JavaFunctional.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);

        Integer increment2 = incrementByOneFunction.apply(1);

        int multiply =  multiplyBy10Function.apply(2);


        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(2));

        //BiFunction
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberIncrement, numberMultiply) ->
                    (numberIncrement + 1) * numberMultiply;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
