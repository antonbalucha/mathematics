package mathematics.tree.node.operator;

import static mathematics.ApplicationSettings.getLocale;

import java.util.HashMap;

import mathematics.data.Locale;
import mathematics.tree.Node;
import mathematics.tree.node.Operator;

public class Equivalency extends Operator {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "=";

    static {
        names.put(Locale.ENGLISH, "is equal to");
        names.put(Locale.SLOVAK, "rovná sa");
    }

    public Node simplify() {
        return this;
    }

    public Node simplyfyAndReplace() {
        return this;
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

    public Equivalency makeClone() {
        Equivalency equivalency = new Equivalency();
        return equivalency;
    }

    public String toString() {
        return this.output();
    }
}
