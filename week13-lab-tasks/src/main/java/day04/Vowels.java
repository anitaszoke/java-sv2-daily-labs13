package day04;

import java.util.HashMap;
import java.util.Map;

public class Vowels {

    private final String VOWELS = "aAeEiIoOuU";

    public Map<String, Integer> getCharacterVowels(String s) {
        Map<String, Integer> result = new HashMap<>();
        String sC;

        for (Character c : s.toCharArray()) {
            if (!result.containsKey(c.toString()) && VOWELS.contains(c.toString())) {
                sC = c.toString();
                result.put(sC, 1);
            } else if (result.containsKey(c.toString()) && VOWELS.contains(c.toString())) {
                sC = c.toString();
                int count = result.get(sC);
                result.put(sC, count + 1);
            }
        }
        return result;
    }

    public Map<String, Integer> getVowels(String s) {
        String lowerS = s.toLowerCase();
        Map<String, Integer> result = new HashMap<>();
        String sC;
        for (Character c : lowerS.toCharArray()) {
            if (!result.containsKey(c.toString()) && VOWELS.contains(c.toString())) {
                sC = c.toString();
                result.put(sC, 1);
            } else if (result.containsKey(c.toString()) && VOWELS.contains(c.toString())) {
                sC = c.toString();
                int count = result.get(sC);
                result.put(sC, count + 1);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Vowels sm = new Vowels();

        System.out.println(sm.getCharacterVowels("IDEA Community Edition"));
        System.out.println(sm.getVowels("IDEA Community Edition"));
        //System.out.println(sm.removeConsonants("IDEA Community Edition"));
    }
}
