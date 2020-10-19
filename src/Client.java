public class Client {

    public void useToken()
    {
        IVisitor visitor = new Visitor();
        Operand operand = new Operand(4);
        Operand operand1 = new Operand(3);
        Operand operand2 = new Operand(2);
        Operator operator = new Operator(1);
        Operator operator1 = new Operator(4);
        Operand operand3 = new Operand(5);
        Operator operator2 = new Operator(2);

        operand.accept(visitor);
        operand1.accept(visitor);
        operand2.accept(visitor);
        operator.accept(visitor);
        operator1.accept(visitor);
        operand3.accept(visitor);
        operator2.accept(visitor);
        Operand answer = (Operand) visitor.getList().pop();
        System.out.println(answer.getValue());

    }
}
