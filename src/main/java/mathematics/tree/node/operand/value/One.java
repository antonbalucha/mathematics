package mathematics.tree.node.operand.value;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Value;

public class One extends Value {

    public static final BigDecimal VALUE = new BigDecimal("1");

    public One() {
        super(VALUE);
    }

    public String output() {
        return VALUE.toString();
    }

    public String outputByWords() {
        return VALUE.toString();
    }

    public One makeClone() {
        One one = new One();
        return one;
    }

    public String toString() {
        return output();
    }
}
