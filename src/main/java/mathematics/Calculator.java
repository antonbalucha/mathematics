package mathematics;

import java.math.BigDecimal;

import mathematics.tree.Node;

public class Calculator {

    public static BigDecimal multiplyChildren(Node node) {
        BigDecimal left = node.asValue().val;
        BigDecimal right = node.asValue().val;
        return multiply(left, right);
    }

    public static BigDecimal multiply(BigDecimal left, BigDecimal right) {
        return left.multiply(right);
    }

    public static BigDecimal divideChildren(Node node) {
        BigDecimal left = node.asValue().val;
        BigDecimal right = node.asValue().val;
        return divide(left, right);
    }

    public static BigDecimal divide(BigDecimal left, BigDecimal right) {
        return left.divide(right);
    }

    public static BigDecimal moduloChildren(Node node) {
        BigDecimal left = node.asValue().val;
        BigDecimal right = node.asValue().val;
        return modulo(left, right);
    }

    public static BigDecimal modulo(BigDecimal left, BigDecimal right) {
        return left.divideAndRemainder(right)[1];
    }

    public static BigDecimal addChildren(Node node) {
        BigDecimal left = node.asValue().val;
        BigDecimal right = node.asValue().val;
        return add(left, right);
    }

    public static BigDecimal add(BigDecimal left, BigDecimal right) {
        return left.add(right);
    }

    public static BigDecimal subtractChildren(Node node) {
        BigDecimal left = node.asValue().val;
        BigDecimal right = node.asValue().val;
        return subtract(left, right);
    }

    public static BigDecimal subtract(BigDecimal left, BigDecimal right) {
        return left.subtract(right);
    }
}
