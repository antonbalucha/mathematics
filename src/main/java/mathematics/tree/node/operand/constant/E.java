package mathematics.tree.node.operand.constant;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Variable;

/** Euler's number */
public class E extends Variable {

    private static final String NAME = "e";

    private static final String CHARACTER = "e";

    private static final BigDecimal VALUE = new BigDecimal("2.718281828459045235360287471352");

    public E() {
        super(CHARACTER, VALUE);
    }

    public String output() {
        return CHARACTER;
    }

    public String outputByWords() {
        return NAME;
    }

    public E makeClone() {
        E euler = new E();
        return euler;
    }

    public String toString() {
        return output();
    }
}
