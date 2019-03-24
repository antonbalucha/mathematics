package mathematics.tree.node.operand.variable;

import static mathematics.ApplicationSettings.getLocale;

import java.util.HashMap;

import mathematics.data.Character;
import mathematics.data.Locale;
import mathematics.data.Name;
import mathematics.tree.node.operand.Variable;

public class Velocity extends Variable implements Name, Character {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "v";

    static {
        names.put(Locale.ENGLISH, "velocity");
        names.put(Locale.SLOVAK, "rýchlosť");
    }

    public Velocity() {
        super(character);
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

    public Velocity makeClone() {
        Velocity velocity = new Velocity();
        velocity.var = this.var;
        velocity.val = super.val;
        return velocity;
    }

    public String toString() {
        return this.output();
    }
}
