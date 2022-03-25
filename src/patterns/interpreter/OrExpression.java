package patterns.interpreter;

public record OrExpression(Expression firstExpression,
                           Expression secondExpression) implements Expression {

    @Override
    public boolean interpret(String context) {
        return firstExpression.interpret(context) || secondExpression.interpret(context);
    }
}
