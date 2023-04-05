package day03;
public class Emre_Soru {
    public static void main(String[] args) {
        String sentence = "Aniruddha Routh Loves To Code Everyday";
        String newSentence = "";

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (currentChar == ' ') {
                newSentence += currentChar;
            } else {
                int charCode = (int) currentChar;

                if (charCode >= 65 && charCode <= 90) {
                    newSentence += (char) (charCode + 32);
                } else {
                    newSentence += currentChar;
                }
            }
        }

        System.out.println(newSentence);
    }
}
