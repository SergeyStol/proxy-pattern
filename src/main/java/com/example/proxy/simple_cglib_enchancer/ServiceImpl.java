package com.example.proxy.simple_cglib_enchancer;

import com.example.proxy.simple_interface.IService;

public class ServiceImpl implements IService {
    @Override
    public String foo() {
        String str = "service impl function foo";
        System.out.println(str);
        return str;
    }
}