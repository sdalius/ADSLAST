import java.util.LinkedList;

interface IVisitor<AnyType> {
    void visit(Operand operand);
    void visit (Operator operator);
    void performOperation();
    LinkedList<AnyType> getList();
}
