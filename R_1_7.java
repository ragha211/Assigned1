public class R_1_7 {
        public static int sumOfSquaresUpToN(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += (i * i);
            }
            return sum;
        }

        public static void main(String[] args) {
            int num =9;
            System.out.println(sumOfSquaresUpToN(num));
        }

    }
