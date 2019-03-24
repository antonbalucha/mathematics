package mathematics;

import mathematics.data.Locale;
import mathematics.tree.Node;

public class Main {

    public static void main(String[] args) {

        ApplicationSettings.setLocale(Locale.ENGLISH);

        Node vypocetDrahy = Formulas.calculateDistance();
        System.out.println(vypocetDrahy.outputNode());
        System.out.println(vypocetDrahy.outputByWordsNode());

        Node vypocetCasu = Formulas.calculateTime();
        System.out.println(vypocetCasu.outputNode());
        System.out.println(vypocetCasu.outputByWordsNode());

        Node vypocetRychlosti = Formulas.calculateVelocity();
        System.out.println(vypocetRychlosti.outputNode());
        System.out.println(vypocetRychlosti.outputByWordsNode());

        Node priklad11 = Examples.simpleExample11();
        System.out.println(priklad11.outputNode());
        System.out.println(priklad11.outputByWordsNode());
        System.out.println(priklad11.asOperant().simplyfyAndReplace().outputNode());

        Node priklad12 = Examples.simpleExample12();
        System.out.println(priklad12.outputNode());
        System.out.println(priklad12.outputByWordsNode());
        System.out.println(priklad12.asOperant().simplyfyAndReplace().outputNode());

    }
}

// pomocne operacie - ci je list, kolko ma potomkov
// zakladne operacie nad uzlom ak su to listy
// pridat kontrolu na delenie nulou/modulo nulou/nevalidne strhom