package mathematics.tree.node.operand.value;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Value;

public class One extends Value {

    public static final BigDecimal val = new BigDecimal("1");

    public One() {
        super(val);
    }

    public String output() {
        return val.toString();
    }

    public String outputByWords() {
        return val.toString();
    }

    public One makeClone() {
        One one = new One();
        return one;
    }

    public String toString() {
        return output();
    }
}
