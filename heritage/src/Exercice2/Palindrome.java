package Exercice2;

public class Palindrome {

    public Palindrome() {
    }

    public String Inverse(String s) {
        StringBuffer chaine = new StringBuffer();
        int i = s.length() - 1;
        while (i >= 0) {
            System.out.println(s.charAt(i));
            chaine.append(s.charAt(i));
            i--;
        }
        return chaine.toString();
    }
}
