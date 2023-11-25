public class R_1_4 {
    public static boolean isEven(int i) {
            return (i & 1) == 0;
        }
    public static void main(String[] args) {
            int num = 13;
            System.out.println(isEven(num));
        }
    }
