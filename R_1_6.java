public class R_1_6 {
        public static int sumOfOddUpToN(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            return sum;
        }
        public static void main(String[] args) {
            int num = 10;
            System.out.println(sumOfOddUpToN(num));
        }
    }
