import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class Testing
{


    @Test
    public void testAssertTrue()
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
        assertEquals(15, answer.getValue());
    }

    @Test
    public void testAssertFalse()
    {
        IVisitor visitor = new Visitor();
        Operand operand = new Operand(4);
        Operand operand1 = new Operand(3);
        Operand operand2 = new Operand(-5);
        Operator operator = new Operator(1);
        Operator operator1 = new Operator(2);
        Operand operand3 = new Operand(5);
        Operator operator2 = new Operator(1);

        operand.accept(visitor);
        operand1.accept(visitor);
        operand2.accept(visitor);
        operator.accept(visitor);
        operator1.accept(visitor);
        operand3.accept(visitor);
        operator2.accept(visitor);
        Operand answer = (Operand) visitor.getList().pop();
        System.out.println(answer.getValue());
        assertNotSame(15, answer.getValue());
    }


    @Test
    public void testAssertNotNull()
    {
        IVisitor visitor = new Visitor();
        Operand operand = new Operand(4);
        Operand operand1 = new Operand(3);
        Operand operand2 = new Operand(-5);
        Operator operator = new Operator(1);
        Operator operator1 = new Operator(4);
        Operand operand3 = new Operand(5);
        Operator operator2 = new Operator(1);

        operand.accept(visitor);
        operand1.accept(visitor);
        operand2.accept(visitor);
        operator.accept(visitor);
        operator1.accept(visitor);
        operand3.accept(visitor);
        operator2.accept(visitor);
        Operand answer = (Operand) visitor.getList().pop();
        System.out.println(answer.getValue());
        assertNotNull(answer.getValue());
    }

    @Test
    public void testAssertException()
    {
        IVisitor visitor = new Visitor();
        Operand operand = new Operand(4);
        Operand operand1 = new Operand(3);
        Operand operand2 = new Operand(-5);
        Operator operator = new Operator(1);
        Operator operator1 = new Operator(-5);
        Operand operand3 = new Operand(5);
        Operator operator2 = new Operator(1);

        operand.accept(visitor);
        operand1.accept(visitor);
        operand2.accept(visitor);
        operator.accept(visitor);
        operator1.accept(visitor);
        operand3.accept(visitor);
        operator2.accept(visitor);
        Operand answer = (Operand) visitor.getList().pop();
        System.out.println(answer.getValue());




        try {
            answer.getValue();
            fail("Expected an IndexOutOfBoundsException to be thrown");
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
            assertEquals("java.util.NoSuchElementException",exception.getMessage());
        }
        assertNull(answer.getValue());
    }

}
