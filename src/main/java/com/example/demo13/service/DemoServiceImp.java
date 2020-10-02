package com.example.demo13.service;


import org.springframework.stereotype.Component;

@Component
public class DemoServiceImp implements DemoService {

    public DemoServiceImp() {
        System.out.println("DemoServiceImp constrcut");
    }



    @Override
    public void DoSome() {
        System.out.println("hello world !");
    }
}
