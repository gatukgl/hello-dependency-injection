package com.example.demodependencyinjection;

public class Hello {
    private String message = "Default message";
    private Dependency dependency = new Dependency();

    public Hello() {

    }

    public Hello(String message) {
        this.message = message;
    }

    public Hello(Dependency dependency) {
        this.dependency = dependency;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Dependency getDependency() {
        return dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
