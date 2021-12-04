package com.example.proxy.simple_interface;

public class Appl {
    public static void main(String[] args) {
        IService service = new ServiceProxy(new ServiceImpl());
        service.foo();
    }
}