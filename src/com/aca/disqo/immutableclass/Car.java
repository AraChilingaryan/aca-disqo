package com.aca.disqo.immutableclass;

public final class Car {

    private final int productionYear;
    private final String model;
    private final String mark;
    private final Engine engine;


    public Car(final int productionYear,final String model,final String mark,final Engine engine){
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = engine.copy();
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return this.engine.copy();
    }

}
