package com.example.demo13.bean;


import org.springframework.stereotype.Component;


public class Dog {
    private String name;
    private int age;

    public Dog() {
        System.out.println("dog constrcut");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
