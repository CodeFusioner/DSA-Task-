package DSA_WEEK_1;
import java.util.*;
public class findCommonCharacters {
    public static void main(String[] args) {
        String [] words = {"bella","label","roller"};
        List<String> list = new ArrayList<>();
        list = commonChars(words);
        System.out.println(list);
    }
    public static List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        for (int i = 0; i < 26; i++) {
            minFreq[i] = Integer.MAX_VALUE;
        }
        for (String word : words) {
            int[] charFreq = new int[26];
            for (char c : word.toCharArray()) {
                charFreq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }
}
