package mathematics.tree.node.operand;

import java.math.BigDecimal;

import mathematics.tree.node.Operand;

public class Variable extends Operand {

    public String var;

    public BigDecimal val;

    public Variable(String var) {
        this(var, null);
    }

    public Variable(String var, BigDecimal val) {
        this.var = var;
        this.val = val;
    }

    public String output() {
        return this.var;
    }

    public String outputByWords() {
        return this.var;
    }

    public Variable makeClone() {
        Variable variable = new Variable(this.var, this.val);
        return variable;
    }

    public String toString() {
        return output();
    }
}
