package com.aca.disqo;

import com.aca.disqo.calculateexpression.Expression;
import com.aca.disqo.calculateexpression.OperatorExpression;

public class Main {
    public static void main(String[] args) {

        Expression expression = new OperatorExpression();
        System.out.println(expression.calculate("6+5+7+8+5"));

    }
}
