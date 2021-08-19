package com.aca.disqo.calculateexpression;

public class OperatorExpression implements Expression {

    private Expression left;
    private Expression right;
    private Operator operator;

    public OperatorExpression() {
    }

    public int calculate(String expression) {
        if (!expression.contains("+") && !expression.contains("-")) {
            right = new ValueExpression();
            return right.calculate(expression);
        }
        String[] expressions = Parser.parse(expression);
        String rightStr = expressions[1];
        String leftStr = expressions[0];
        this.left = new ValueExpression();
        this.right = new OperatorExpression();
        operator = new Operator(Parser.findOperator(expression));
        return operator.detectOperator(left, right, leftStr, rightStr);
    }

}
