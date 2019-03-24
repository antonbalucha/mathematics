package mathematics.tree.node.operand;

import java.math.BigDecimal;

import mathematics.tree.node.Operand;
import mathematics.tree.node.operand.value.One;
import mathematics.tree.node.operand.value.MinusOne;
import mathematics.tree.node.operand.value.Zero;

public class Value extends Operand {

    public final BigDecimal val;

    public Value(BigDecimal val) {
        this.val = val;
    }

    public Value(int val) {
        this(new BigDecimal(val));
    }

    public boolean isValueMinusOne() {
        return this.val.equals(MinusOne.VALUE);
    }

    public boolean isValueZero() {
        return this.val.equals(Zero.VALUE);
    }

    public boolean isValueOne() {
        return this.val.equals(One.VALUE);
    }

    public String output() {
        return this.val.toString();
    }

    public String outputByWords() {
        return this.val.toString();
    }

    public Value makeClone() {
        Value value = new Value(this.val);
        return value;
    }

    public String toString() {
        return this.output();
    }
}
