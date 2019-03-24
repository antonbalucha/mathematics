package mathematics.tree.node.operant;

import java.math.BigDecimal;
import java.util.HashMap;

import mathematics.ApplicationSettings;
import mathematics.Calculator;
import mathematics.data.Locale;
import mathematics.tree.Node;
import mathematics.tree.node.Operator;
import mathematics.tree.node.operand.Value;
import mathematics.tree.node.operand.value.Zero;

public class Multiplication extends Operator {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = ".";

    static {
        names.put(Locale.ENGLISH, "multiplied by");
        names.put(Locale.SLOVAK, "krát");
    }

    public Node simplify() {

        Node result = null;

        if (areBothChildValues()) {
            BigDecimal vynasobene = Calculator.multiplyChildren(this);
            result = new Value(vynasobene);
        } else if ((isLeftValue() && left.asValue().isValueZero()) || (isRightValue() && right.asValue().isValueZero())) {
            result = new Zero();
        } else if (isLeftValue() && left.asValue().isValueOne()) {
            result = right;
        } else if (isRightValue() && right.asValue().isValueOne()) {
            result = left;
        }

        return result;
    }

    public Node simplyfyAndReplace() {

        Node result = simplify();

        if (result != null) {
            return changeMeForNewNode(result);
        } else {
            return this;
        }
    }

    public String name() {
        return names.get(ApplicationSettings.getLocale());
    }
    
    public String character() {
        return character;
    }

    public String output() {
        return character;
    }

    public String outputByWords() {
        return names.get(ApplicationSettings.getLocale());
    }

    public Multiplication makeClone() {
        Multiplication multiplication = new Multiplication();
        return multiplication;
    }

    public String toString() {
        return this.output();
    }
}
