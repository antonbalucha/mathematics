package mathematics.tree.node.operand.value;

import java.math.BigDecimal;

import mathematics.tree.node.operand.Value;

public class MinusOne extends Value {

    public static final BigDecimal val = new BigDecimal("-1");

    public MinusOne() {
        super(val);
    }

    public String output() {
        return val.toString();
    }

    public String outputByWords() {
        return val.toString();
    }

    public MinusOne makeClone() {
        MinusOne minusOne = new MinusOne();
        return minusOne;
    }

    public String toString() {
        return output();
    }
}
