package com.aca.disqo.immutableclass;

public class Engine {

    private int horsePower;
    private int weight;
    private int mileage;

    public Engine(int horsePower, int weight, int mileage) {
        this.horsePower = horsePower;
        this.weight = weight;
        this.mileage = mileage;
    }

    public Engine() {
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public int getMileage() {
        return mileage;
    }

    public Engine copy(final Engine engine){
        final Engine cloneEngine = new Engine();
        cloneEngine.setWeight(engine.getWeight());
        cloneEngine.setMileage(engine.getMileage());
        cloneEngine.setHorsePower(engine.getHorsePower());
        return cloneEngine;
    }
}
