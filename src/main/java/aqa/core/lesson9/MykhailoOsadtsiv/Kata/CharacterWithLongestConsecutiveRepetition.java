package aqa.core.lesson9.MykhailoOsadtsiv.Kata;

//For a given string s find the character c (or C) with longest consecutive repetition and return:
//
//Object[]{c, l};
//where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.
//
//For empty string return:
//
//Object[]{"", 0}
//Happy coding! :)
//
//ALGORITHMSSTRINGSFUNDAMENTALS
public class CharacterWithLongestConsecutiveRepetition {
    public String str;
    public int counter;
    public static void main(String[] args) {
        CharacterWithLongestConsecutiveRepetition o1 = new CharacterWithLongestConsecutiveRepetition();
        o1 = longestRepetition("asdasdsdasddddddsdsda");
        System.out.println(o1.str);
        System.out.println(o1.counter);
    }


    public static CharacterWithLongestConsecutiveRepetition longestRepetition(String s) {
        if (s == "") return new CharacterWithLongestConsecutiveRepetition("", 0);
        String d = "";
        char c = s.charAt(0);
        int l=1;

        for (int i = 1; i < s.length() - 1; i++) {
            char temp = s.charAt(i);
            int count = 1;
            for (int j = i; j <s.length(); j++) {
                if (s.charAt(j - 1) == s.charAt(j)) {
                    count++;
                } else break;
            }
            if (count > l) {
                c = temp;
                l = count;
                i += l;
            }
        }
        d += c;
        return new CharacterWithLongestConsecutiveRepetition(d, l);
    }

    public CharacterWithLongestConsecutiveRepetition(String str, int counter) {
        this.str = str;
        this.counter = counter;
    }

    public CharacterWithLongestConsecutiveRepetition() {}
}
