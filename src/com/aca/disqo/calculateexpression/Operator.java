package com.aca.disqo.calculateexpression;

public class Operator {
    private char operator;

    public Operator(char operator) {
        this.operator = operator;

    }

    public int detectOperator(Expression left, Expression right,
                               String leftExp, String rightExpr){
        switch(operator){
            case '+' :
            case '-' :
            {
                return left.calculate(leftExp) + right.calculate(rightExpr);
            }
        }
        return 1;
    }
}
