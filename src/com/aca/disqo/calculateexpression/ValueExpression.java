package com.aca.disqo.calculateexpression;

public class ValueExpression implements Expression {

    public ValueExpression() {

    }

    @Override
    public int calculate(String expression) {
         return Integer.parseInt(expression);
    }
}
