package mathematics.tree.node.operator;

import static mathematics.ApplicationSettings.getLocale;

import java.math.BigDecimal;
import java.util.HashMap;

import mathematics.Calculator;
import mathematics.data.Locale;
import mathematics.tree.Node;
import mathematics.tree.node.Operator;
import mathematics.tree.node.operand.Value;

public class Addition extends Operator {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "+";

    static {
        names.put(Locale.ENGLISH, "plus");
        names.put(Locale.SLOVAK, "plus");
    }

    public Node simplify() {

        Node result = null;

        if (areBothChildValues()) {
            BigDecimal scitanie = Calculator.addChildren(this);
            result = new Value(scitanie);
        } else if (isLeftValue() && left.asValue().isValueZero()) {
            result = right;
        } else if (isRightValue() && right.asValue().isValueZero()) {
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
        return names.get(getLocale());
    }

    public String character() {
        return character;
    }

    public String output() {
        return character;
    }

    public String outputByWords() {
        return names.get(getLocale());
    }

    public Addition makeClone() {
        Addition addition = new Addition();
        return addition;
    }

    public String toString() {
        return this.output();
    }
}
