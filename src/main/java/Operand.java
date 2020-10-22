public class Operand extends Token {
    private int value;

    public Operand( int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
