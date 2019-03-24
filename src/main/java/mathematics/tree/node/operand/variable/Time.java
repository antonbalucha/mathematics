package mathematics.tree.node.operand.variable;

import mathematics.data.Name;

import java.util.HashMap;

import mathematics.ApplicationSettings;
import mathematics.data.Character;
import mathematics.data.Locale;
import mathematics.tree.node.operand.Variable;

public class Time extends Variable implements Name, Character {

    private static final HashMap<Locale, String> names = new HashMap<Locale, String>(2);
    private static final String character = "t";

    static {
        names.put(Locale.ENGLISH, "time");
        names.put(Locale.SLOVAK, "čas");
    }

    public Time() {
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

    public Time makeClone() {
        Time time = new Time();
        time.var = this.var;
        time.val = this.val;
        return time;
    }

    public String toString() {
        return this.output();
    }
}
