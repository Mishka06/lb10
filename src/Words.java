import java.util.*;

public class Words {
    public static void main(String[] args) {
        String str1 = "Я ем печеньку и запиваю чаем";

        String[] words1 = str1.split(" ");

        System.out.println("Самое длинное слово: " + maxLengthWord(words1));

    }

    private static String maxLengthWord(String[] s) {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].toLowerCase();
        }
        Arrays.sort(s);
        int len = 0;
        String longest = "";
        for (String string : s) {
            if (string.length() > len) {
                len = string.length();
                longest = string;
            }
        }
        return longest;
    }
}