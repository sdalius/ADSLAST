import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class Visitor<AnyType> implements IVisitor {

    private LinkedList<AnyType> stack;

    public Visitor()
    {
        stack = new LinkedList<>();
    }
    public void visit(Operand operand) {
        stack.push((AnyType) operand);
    }

    public void visit(Operator operator) {
        stack.push((AnyType) operator);
        performOperation();
    }

    public LinkedList<AnyType> getList()
    {
        return stack;
    }

    public void performOperation() {
        Operator operator = (Operator) stack.pop();
        Operand secondOperand = (Operand) stack.pop();
        Operand firstOperand = (Operand) stack.pop();
        int firstvalue,secondvalue;
        if (operator.getType() == 4)
        {
            secondvalue= secondOperand.getValue();
            firstvalue = firstOperand.getValue();
            stack.push((AnyType)(new Operand(firstvalue*secondvalue)));
        }
        else if( operator.getType() == 3)
        {
            secondvalue= secondOperand.getValue();
            firstvalue = firstOperand.getValue();
            stack.push((AnyType)(new Operand(firstvalue/secondvalue)));
        }
        else if(operator.getType() == 2)
        {
            secondvalue= secondOperand.getValue();
            firstvalue = firstOperand.getValue();
            stack.push((AnyType)(new Operand(firstvalue-secondvalue)));
        }
        else if (operator.getType() == 1){
            secondvalue= secondOperand.getValue();
            firstvalue = firstOperand.getValue();
            stack.push((AnyType)(new Operand(firstvalue+secondvalue)));
        }
        else{
            System.out.println("Type is not inbetween number 1 and 4");
        }
    }
}
