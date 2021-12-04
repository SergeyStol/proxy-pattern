package com.example.proxy.simple_cglib_enchancer;

public abstract class UserAbstract {
    public String getName() {
        String nameFromUserClass = "NameFromUserClass";
        System.out.println(nameFromUserClass);
        return nameFromUserClass;
    }

    public abstract String getSurname();
}
