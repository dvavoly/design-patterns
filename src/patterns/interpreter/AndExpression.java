package patterns.interpreter;

public record AndExpression(Expression firstExpression,
                            Expression secondExpression) implements Expression {

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) && secondExpression.interpret(context);
    }
}
