package mathematics;

import mathematics.tree.Node;
import mathematics.tree.node.operand.Value;
import mathematics.tree.node.operand.Variable;
import mathematics.tree.node.operand.constant.Pi;
import mathematics.tree.node.operand.variable.Velocity;
import mathematics.tree.node.operator.Addition;
import mathematics.tree.node.operator.Division;
import mathematics.tree.node.operator.Modulo;
import mathematics.tree.node.operator.Multiplication;
import mathematics.tree.node.operator.Subtraction;

public class Examples {

    public static Node simpleExample1() {

        return new Modulo() //
                .addLeft(new Value(21)) //
                .addRight(new Value(4)); //
    }

    public static Node simpleExample2() {

        return new Addition() //
                .addLeft(new Value(21)) //
                .addRight(new Value(4)); //
    }

    public static Node simpleExample3() {

        return new Multiplication() //
                .addLeft(new Value(21)) //
                .addRight(new Value(4)); //
    }

    public static Node simpleExample6() {

        return new Division() //
                .addLeft(new Value(21)) //
                .addRight(new Value(4)); //
    }

    public static Node simpleExample7() {

        return new Division() //
                .addLeft(new Value(0)) //
                .addRight(new Value(4)); //
    }

    public static Node simpleExample8() {

        return new Multiplication() //
                .addLeft(new Value(0)) //
                .addRight(new Velocity()); //
    }

    public static Node simpleExample9() {

        return new Subtraction() //
                .addLeft(new Value(0)) //
                .addRight(new Velocity()); //
    }

    public static Node simpleExample10() {

        return new Subtraction() //
                .addLeft(new Velocity()) //
                .addRight(new Value(0)); //
    }

    public static Node simpleExample11() {

        return new Modulo() //
                .addLeft(new Value(1)) //
                .addRight(new Value(0)); //
    }

    public static Node simpleExample12() {

        return new Modulo() //
                .addLeft(new Variable("q")) //
                .addRight(new Multiplication() //
                        .addLeft(new Pi()) //
                        .addRight(new Division() //
                                .addLeft(new Pi()) //
                                .addRight(new Value(1)) //
        )); //
    }
}
