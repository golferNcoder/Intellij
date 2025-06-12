package org.example;

public class Engine {
    private int horsePower;
    private String name;

    public Engine(int horsePower, String name) {
        this.horsePower = horsePower;
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
