package mathematics.tree.node.operand.value;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Value;

public class Zero extends Value {

    public static final BigDecimal VALUE = new BigDecimal("0");

    public Zero() {
        super(VALUE);
    }

    public String output() {
        return VALUE.toString();
    }

    public String outputByWords() {
        return VALUE.toString();
    }

    public Zero makeClone() {
        Zero zero = new Zero();
        return zero;
    }

    public String toString() {
        return output();
    }
}
