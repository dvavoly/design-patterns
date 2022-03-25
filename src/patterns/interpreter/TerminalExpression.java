package patterns.interpreter;

public record TerminalExpression(String data) implements Expression {
    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
