package mathematics.tree.node.operant;

import java.math.BigDecimal;
import java.util.HashMap;

import mathematics.ApplicationSettings;
import mathematics.Calculator;
import mathematics.data.Locale;
import mathematics.tree.Node;
import mathematics.tree.node.Operator;
import mathematics.tree.node.operand.Value;

public class Subtraction extends Operator {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "-";

    static {
        names.put(Locale.ENGLISH, "subtract");
        names.put(Locale.SLOVAK, "mínus");
    }

    public Node simplify() {

        Node result = null;

        if (areBothChildValues()) {
            BigDecimal odcitane = Calculator.subtractChildren(this);
            result = new Value(odcitane);
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

    public Subtraction makeClone() {
        Subtraction subtraction = new Subtraction();
        return subtraction;
    }

    public String toString() {
        return this.output();
    }
}
