package org.example;

public class Car {
    public String name;
    public Engine engine;

    public Car (String name, Engine engine){
        this.name=name;
        this.engine=engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Car{name='" + name + "', engine=" + engine.getName() + "}");
    }
}
