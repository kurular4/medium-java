package com.omer.medium.optionals;

import java.util.Optional;

public class OptionalsDemo {
    public static void main(String[] args) {
        // Nullable given null
        Object someObject = null;
        Optional<Object> objectOptional = Optional.ofNullable(someObject);
        System.out.println(objectOptional.isPresent()); // prints false

        // Nullable given non-null
        Object someObject2 = new Object();
        Optional<Object> objectOptional2 = Optional.ofNullable(someObject2);
        System.out.println(objectOptional2.isPresent()); // prints true

        // Nullable given non-null
        Optional<Object> optionalNullable = Optional.ofNullable(new Object());

        // Non-nullable given non-null
        Optional<Object> optionalOf = Optional.of(new Object());

        // Empty
        Optional<Object> optionalEmpty = Optional.empty();

        // ifPresent
        Optional<String> stringOptional = Optional.of("Hi!");
        Optional<String> stringOptionalNull = Optional.empty();

        stringOptional.ifPresent(System.out::println); // prints "Hi!"
        stringOptionalNull.ifPresent(System.out::println); // prints nothing

        // orElse
        Optional<String> stringOptionalNull1 = Optional.empty();
        String backupValue = stringOptionalNull1.orElse("Hi!");
        System.out.println(backupValue); // prints "Hi!"

        // orElseGet
        Optional<String> stringOptionalNull2 = Optional.empty();
        String backupValue2 = stringOptionalNull2.orElseGet(() -> "Hi!");
        System.out.println(backupValue2); // prints "Hi!"

        // orElse vs orElseGet
        Optional<String> stringOptional2 = Optional.of("I exist..");
        String value = stringOptional2.orElse(getStr());
        String value2 = stringOptional2.orElseGet(() -> getStr());

        // orElseThrow
        Optional<String> stringOptionalNull3 = Optional.empty();
        String backupValue3 = stringOptional.orElseThrow(RuntimeException::new);

        // Cache returning optional
        ObjectCache.INSTANCE.get("key").ifPresent(object -> {
            System.out.println("I do exist");
        });
    }

    public static String getStr() {
        System.out.println("I am being evaluated");
        return "Hi!";
    }
}
