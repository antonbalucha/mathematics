package mathematics;

import mathematics.tree.Node;
import mathematics.tree.node.operand.variable.Distance;
import mathematics.tree.node.operand.variable.Time;
import mathematics.tree.node.operand.variable.Velocity;
import mathematics.tree.node.operator.Division;
import mathematics.tree.node.operator.Equivalency;
import mathematics.tree.node.operator.Multiplication;

public class Formulas {

    public static Node calculateDistance() {

        return new Equivalency() //
                .addLeft(new Distance()) //
                .addRight(new Multiplication() //
                        .addLeft(new Time()) //
                        .addRight(new Velocity()) //
        ); //
    }

    public static Node calculateTime() {

        return new Equivalency() //
                .addLeft(new Time()) //
                .addRight(new Division() //
                        .addLeft(new Distance()) //
                        .addRight(new Velocity()) //
        ); //
    }

    public static Node calculateVelocity() {

        return new Equivalency() //
                .addLeft(new Velocity()) //
                .addRight(new Division() //
                        .addLeft(new Distance()) //
                        .addRight(new Time()) //
        ); //
    }
}
