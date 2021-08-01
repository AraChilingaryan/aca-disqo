package com.aca.disqo.calculateexpression;

import java.util.Stack;
import java.util.stream.Collectors;

public class OperatorExpression extends Expression {

    private Expression left;
    private Expression right;
    private static Stack<Expression> expressionStack = new Stack<>();

    public OperatorExpression() {
    }



    @Override
    public int calculate(String expression) {

        String forLeft = String.valueOf(expression.toCharArray()[0]);
        String forRight = expression.substring(2);
        left = new ValueExpression(forLeft);
        expressionStack.push(left);
        if (forRight.length() == 1){
            right = new ValueExpression(forRight);
            expressionStack.push(right);
            return expressionStack.stream().mapToInt(value1 -> value1.value).sum();
        }
        right = new OperatorExpression();
        return calculate(forRight);
    }
}
