package mathematics.tree.node.operator;

import static mathematics.ApplicationSettings.getLocale;

import java.math.BigDecimal;
import java.util.HashMap;

import mathematics.Calculator;
import mathematics.data.Locale;
import mathematics.tree.Node;
import mathematics.tree.node.Operator;
import mathematics.tree.node.operand.Value;
import mathematics.tree.node.operand.value.Zero;

public class Division extends Operator {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "/";

    static {
        names.put(Locale.ENGLISH, "divide");
        names.put(Locale.SLOVAK, "deleno");
    }

    public Node simplify() {

        Node result = null;

        if (areBothChildValues() && !right.asValue().isValueZero()) {
            BigDecimal vysledokDelenia = Calculator.divideChildren(this);
            result = new Value(vysledokDelenia);
        } else if (isLeftValue() && left.asValue().isValueZero()) {
            result = new Zero();
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

    public Division makeClone() {
        Division division = new Division();
        return division;
    }

    public String toString() {
        return this.output();
    }
}
