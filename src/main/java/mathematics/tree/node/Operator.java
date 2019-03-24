package mathematics.tree.node;

import mathematics.data.Calculation;
import mathematics.data.Character;
import mathematics.data.Clone;
import mathematics.data.Name;
import mathematics.data.Ouput;
import mathematics.data.OutputByWords;
import mathematics.tree.Node;

public abstract class Operator extends Node implements Name, Character, Ouput, OutputByWords, Calculation, Clone {

    public abstract Node simplify();

    public abstract Node simplyfyAndReplace();

    public abstract String name();

    public abstract String character();

    public abstract String output();

    public abstract String outputByWords();

    public abstract Node makeClone();
}
