public class R_1_8 {
    public static int countVowels(String str) {
            int vowelCount = 0;
            str = str.toUpperCase();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCount++;
                }
            }
            return vowelCount;
        }

        public static void main(String[] args) {
            String inputString = "Hello, World!";
            System.out.println( countVowels(inputString));
        }

    }
