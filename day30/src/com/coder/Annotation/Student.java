package com.coder.Annotation;

public class Student {
    @Value(value="1")
    private String name;
    @Value("女")
    private String gender;
    @Value("10")
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
