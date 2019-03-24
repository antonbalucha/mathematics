package mathematics.tree.node.operand.variable;

import java.util.HashMap;

import mathematics.ApplicationSettings;
import mathematics.data.Character;
import mathematics.data.Locale;
import mathematics.data.Name;
import mathematics.tree.node.operand.Variable;

public class Distance extends Variable implements Name, Character {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "d";

    static {
        names.put(Locale.ENGLISH, "distance");
        names.put(Locale.SLOVAK, "dráha");
    }

    public Distance() {
        super(character);
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

    public Distance makeClone() {
        Distance distance = new Distance();
        distance.var = this.var;
        distance.val = super.val;
        return distance;
    }

    public String toString() {
        return this.output();
    }
}
