package mathematics.tree.node.operand.constant;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Variable;

/** Pi */
public class Pi extends Variable {

    private static final String NAME = "pí";

    private static final String CHARACTER = "π";

    private static final BigDecimal VALUE = new BigDecimal("3.141592653589793238462643383279502884197169399375105820974944");

    public Pi() {
        super(CHARACTER, VALUE);
    }

    public String output() {
        return CHARACTER;
    }

    public String outputByWords() {
        return NAME;
    }

    public Pi makeClone() {
        Pi pi = new Pi();
        return pi;
    }

    public String toString() {
        return output();
    }
}
