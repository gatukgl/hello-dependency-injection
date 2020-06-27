package com.example.demodependencyinjection;

public class Client {
    public static void main(String[] args) {
        // Constructor injection
        // Hello hello = new Hello("Gatuk");

        // Setter injection
        Hello hello = new Hello();
        hello.setMessage("Me");
        String message = hello.getMessage();

        System.out.println("Hello, my name is " + message);


        Dependency dependency = new Dependency();
        dependency.setName("My dependency");
        System.out.println("========================= Dependency injection by constructor");
        Hello hello2 = new Hello(dependency);
        String dependencyName = hello2.getDependency().getName();
        System.out.println(dependencyName);

        System.out.println("========================= Dependency injection by setter");
        Hello hello3 = new Hello();
        hello3.setDependency(dependency);
        System.out.println(hello2.getDependency().getName());
    }
}
