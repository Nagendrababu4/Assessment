public class Pangram {
        public static void main(String[] args) {
            String inputSentence = "The quick brown fox jumps over the lazy dog";
            boolean isPangram = isPangram(inputSentence);
            if (isPangram) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }
        }
    
        public static boolean isPangram(String sentence) {
            boolean[] alphabetCheck = new boolean[26];
            int alphabetCount = 0;
    
            for (int i = 0; i < sentence.length(); i++) {
                char ch = Character.toLowerCase(sentence.charAt(i));
                if ('a' <= ch && ch <= 'z' && !alphabetCheck[ch - 'a']) {
                    alphabetCheck[ch - 'a'] = true;
                    alphabetCount++;
                }
            }
            return alphabetCount == 26;
        }
    }
