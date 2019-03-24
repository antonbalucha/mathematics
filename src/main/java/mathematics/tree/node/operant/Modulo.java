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

public class Modulo extends Operator {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "%";

    static {
        names.put(Locale.ENGLISH, "modulo");
        names.put(Locale.SLOVAK, "zvyšok po delení");
    }

    public Node simplify() {

        Node result = null;

        if (areBothChildValues() && !right.asValue().isValueZero()) {
            BigDecimal vysledokDelenia = Calculator.moduloChildren(this);
            result = new Value(vysledokDelenia);
        } else if (isLeftValue() && left.asValue().isValueZero()) {
            result = new Zero();
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

    public Modulo makeClone() {
        Modulo modulo = new Modulo();
        return modulo;
    }

    public String toString() {
        return this.output();
    }
}
