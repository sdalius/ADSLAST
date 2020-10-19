public class Operator extends Token {
    private int type;

    public Operator( int type)
    {
        if ( type > 4)
        {
            // 1 = +
            // 2 = -
            // 3 = /
            // 4 = *
            System.out.println("There are 4 types of operators in math :). Exiting");
            System.exit(0);
        }
        else{
            this.type = type;
        }
    }

    public int getType()
    {
        return type;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
