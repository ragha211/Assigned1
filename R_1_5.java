public class R_1_5 {
        public static int sumUpToN(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
        public static void main(String[] args) {
            int num = 8;
            System.out.println(sumUpToN(num));
        }}