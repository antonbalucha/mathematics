package mathematics.tree.node.operand.value;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Value;

public class MinusOne extends Value {

    public static final BigDecimal VALUE = new BigDecimal("-1");

    public MinusOne() {
        super(VALUE);
    }

    public String output() {
        return VALUE.toString();
    }

    public String outputByWords() {
        return VALUE.toString();
    }

    public MinusOne makeClone() {
        MinusOne minusOne = new MinusOne();
        return minusOne;
    }

    public String toString() {
        return output();
    }
}
