package mathematics.tree.node;

import mathematics.data.Clone;
import mathematics.data.Ouput;
import mathematics.data.OutputByWords;
import mathematics.tree.Node;

public abstract class Operand extends Node implements Ouput, OutputByWords, Clone {

    public abstract String output();

    public abstract String outputByWords();

    public abstract Node makeClone();
}
