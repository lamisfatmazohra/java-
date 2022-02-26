package Exercice2;

import java.util.ArrayList;

public class Palindrome2 extends Palindrome {

    public Palindrome2() {
        super();
    }

    public String Inverse(String s) {
        String[] array = s.split(" ");
        ArrayList<String> phrase = new ArrayList<String>();
        for (int i = array.length - 1; i >= 0; i--) {
            phrase.add(super.Inverse(array[i]));
        }
        return String.join(" ", phrase);

    }
}
