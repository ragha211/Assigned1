public class R_1_9 {
        public static String removePunctuation(String s) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
        public static void main(String[] args) {
            String sentence = "Let’s try, Mike!";
            System.out.println(removePunctuation(sentence));
        }
    }