package com.example.proxy.simple_interface;

public class ServiceProxy implements IService {

    private IService serviceImpl;

    public ServiceProxy(IService serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    @Override
    public String foo() {
        System.out.println("Before method");
        String str = serviceImpl.foo();
        System.out.println("After method");
        return str;
    }
}
