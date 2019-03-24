package mathematics.tree.node.operand.value;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Value;

public class Zero extends Value {

    public static final BigDecimal val = new BigDecimal("0");

    public Zero() {
        super(val);
    }

    public String output() {
        return val.toString();
    }

    public String outputByWords() {
        return val.toString();
    }

    public Zero makeClone() {
        Zero zero = new Zero();
        return zero;
    }

    public String toString() {
        return output();
    }
}
