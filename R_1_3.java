public class R_1_3 {
  public static boolean isMultiple(long n, long m) {
            return n % m == 0;
        }
 public static void main(String[] args) {
            long n = 10;
            long m = 2;
            System.out.println( isMultiple(n, m));
        }
    }