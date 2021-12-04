package com.example.proxy.simple_cglib_enchancer;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class Appl {
    // example 1
//    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(ServiceImpl.class);
//        enhancer.setCallback((MethodInterceptor) (obj, method, args1, proxy) -> {
//            System.out.println("Before method");
//            Object res = proxy.invokeSuper(obj, new Object[0]);
//            System.out.println("After method");
//            return res;
//        });
//        ServiceImpl proxy = (ServiceImpl) enhancer.create();
//        proxy.foo();
//    }

    // example 2
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserAbstract.class);
        enhancer.setCallback((MethodInterceptor) (obj, method, args1, proxy) -> {
            if (method.getName().equals("getSurname")) {
                System.out.println("Get Surname");
                return "Surname1";
            } else {
                System.out.println("Before method");
                Object res = proxy.invokeSuper(obj, new Object[0]);
                System.out.println("After method");
                return res;
            }
        });
        UserAbstract proxy = (UserAbstract) enhancer.create();
        proxy.getName();
        proxy.getSurname();
    }
}