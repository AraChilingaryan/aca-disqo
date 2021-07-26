package com.aca.disqo.calculateexpression;

public class ValueExpression extends Expression {


    public ValueExpression(String expression){
        this.value =  calculate(expression);
    }

    @Override
    public int calculate(String expression) {
        return calculateValueFrom(expression);
    }

    private int calculateValueFrom(String value) {
        this.value = Integer.parseInt(value);
        return this.value;
    }
}
