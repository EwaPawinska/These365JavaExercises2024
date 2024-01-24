package january.ex005verifywordcontainsvowel;

public class ex005vowelPresentInWord {

    private static final String given = "GivenString";

    public static void main(String[] args) {
        System.out.println(verifyWordContainsVowel(given, 'h'));
    }

    private static boolean verifyWordContainsVowel(String word, char vowel) {
        String StringVowel = String.valueOf(vowel).toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().contains(StringVowel)){
                return true;
            }
        }
        return false;
    }
}
