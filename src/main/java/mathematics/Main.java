package mathematics;

import mathematics.data.Locale;
import mathematics.tree.Node;

public class Main {

    public static void main(String[] args) {

        ApplicationSettings.setLocale(Locale.ENGLISH);

        Node calculateDistance = Formulas.calculateDistance();
        System.out.println(calculateDistance.outputNode());
        System.out.println(calculateDistance.outputByWordsNode());

        Node calculateTime = Formulas.calculateTime();
        System.out.println(calculateTime.outputNode());
        System.out.println(calculateTime.outputByWordsNode());

        Node calculateVelocity = Formulas.calculateVelocity();
        System.out.println(calculateVelocity.outputNode());
        System.out.println(calculateVelocity.outputByWordsNode());

        Node example1 = Examples.simpleExample11();
        System.out.println(example1.outputNode());
        System.out.println(example1.outputByWordsNode());
        System.out.println(example1.asOperator().simplyfyAndReplace().outputNode());

        Node example12 = Examples.simpleExample12();
        System.out.println(example12.outputNode());
        System.out.println(example12.outputByWordsNode());
        System.out.println(example12.asOperator().simplyfyAndReplace().outputNode());

    }
}

// pomocne operacie - ci je list, kolko ma potomkov
// zakladne operacie nad uzlom ak su to listy
// pridat kontrolu na delenie nulou/modulo nulou/nevalidne strhom