package mathematics.tree;

import mathematics.data.Clone;
import mathematics.data.Ouput;
import mathematics.data.OutputByWords;
import mathematics.tree.node.Operator;
import mathematics.tree.node.operand.Value;

public class Node {

    private boolean amILeft;

    private boolean amIRight;

    public Node parent;

    public Node left;

    public Node right;

    /******************************************************************************************************************************************************
     * @return instance of this
     ******************************************************************************************************************************************************/
    public Node cancelParent() {

        if (parent != null) {
            if (amILeft) {
                parent.left = null;
                amILeft = false;
            }
            if (amIRight) {
                parent.right = null;
                amIRight = false;
            }

            parent = null;
        }

        return this;
    }

    /******************************************************************************************************************************************************
     * @return instance of this
     ******************************************************************************************************************************************************/
    public Node cancelLeft() {

        if (left != null) {
            left.parent = null;
            left.amILeft = false;
            left = null;
        }

        return this;
    }

    /******************************************************************************************************************************************************
     * @return instance of this
     ******************************************************************************************************************************************************/
    public Node cancelRight() {

        if (right != null) {
            right.parent = null;
            right.amIRight = false;
            right = null;
        }

        return this;
    }

    /******************************************************************************************************************************************************
     * @return instance of this
     ******************************************************************************************************************************************************/
    public Node makeMeAlone() {

        cancelParent();
        cancelLeft();
        cancelRight();

        return this;
    }

    /******************************************************************************************************************************************************
     * @param left - instance of Node which will be put on the left
     * @return instance of this
     ******************************************************************************************************************************************************/
    public Node addLeft(Node left) {

        this.left = left;
        left.parent = this;
        left.amILeft = true;
        left.amIRight = false;

        return this;
    }

    /******************************************************************************************************************************************************
     * @param left - instance of Node which will be put in the right
     * @return instance of this
     ******************************************************************************************************************************************************/
    public Node addRight(Node right) {

        this.right = right;
        right.parent = this;
        right.amILeft = false;
        right.amIRight = true;

        return this;
    }

    /******************************************************************************************************************************************************
     * @param newNode - this Node will be replaced by novyNode
     * @return instance of new Node
     ******************************************************************************************************************************************************/
    public Node changeMeForNewNode(Node newNode) {
        
        if (parent != null) {
            
            newNode.parent = parent;
            newNode.amILeft = amILeft;
            newNode.amIRight = amIRight;
            
            if (amILeft) {
                parent.left = newNode;
            }
            
            if (amIRight) {
                parent.right = newNode;
            }
        }
        
        makeMeAlone();
        
        return newNode;
    }
    
    /******************************************************************************************************************************************************
     ******************************************************************************************************************************************************/
    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasOnlyLeft() {
        return left != null && right == null;
    }

    public boolean hasRight() {
        return right != null;
    }

    public boolean hasOnlyRight() {
        return right != null && left == null;
    }

    public boolean isList() {
        return left == null && right == null;
    }

    public boolean isLeftValue() {
        return left != null && left instanceof Value;
    }

    public boolean isRightValue() {
        return right != null && right instanceof Value;
    }

    public boolean areBothChildValues() {
        return isLeftValue() && isRightValue();
    }

    /******************************************************************************************************************************************************
     ******************************************************************************************************************************************************/
    public Operator asOperant() {
        return (Operator) this;
    }
    
    public Value asValue() {
        return (Value) this;
    }
    
    public Clone asClone() {
        return (Clone) this;
    }
    
    public Ouput asOutput() {
        return (Ouput) this;
    }
    
    public OutputByWords asOutputByWords() {
        return (OutputByWords) this;
    }
    
    /******************************************************************************************************************************************************
     * @return returns string representation of Node and its children
     ******************************************************************************************************************************************************/
    public String outputNode() {

        StringBuilder sb = new StringBuilder();

        if (left != null) {
            sb.append(left.outputNode());
        }

        Ouput a = this.asOutput();
        sb.append(a.output());
        sb.append(" ");

        if (right != null) {
            sb.append(right.outputNode());
        }

        return sb.toString();
    }

    /******************************************************************************************************************************************************
     * @return returns string representation of Node and its children not by numbers but by words
     ******************************************************************************************************************************************************/
    public String outputByWordsNode() {

        StringBuilder sb = new StringBuilder();

        if (left != null) {
            sb.append(left.outputByWordsNode());
        }

        OutputByWords a = this.asOutputByWords();
        sb.append(a.outputByWords());
        sb.append(" ");

        if (right != null) {
            sb.append(right.outputByWordsNode());
        }

        return sb.toString();
    }

    /******************************************************************************************************************************************************
     * @return returns string representation of Node and its children
     ******************************************************************************************************************************************************/
    public Node makeCloneNode() {

        if (this.isList() && this instanceof Clone) {
            return this.asClone().makeClone();
        } else {

            Node u = this.asClone().makeClone();

            if (this.left != null) {
                u.addLeft(this.left.makeCloneNode());
            }

            if (this.right != null) {
                u.addRight(this.right.makeCloneNode());
            }

            return u;
        }
    }

    /******************************************************************************************************************************************************
     * @return returns string representation of Node and its children
     ******************************************************************************************************************************************************/
    public String toString() {
        return this.outputNode();
    }
}
