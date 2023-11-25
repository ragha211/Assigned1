public class R_1_13 {
    public R_1_13(String name, String california, String s, int i) {
    }
    private void R_1_13(int val) {

    }
    public static void main(String[] args) {
            R_1_13 wallet[] = new R_1_13[3];
            wallet[0] = new R_1_13("Raghad", "hh", "5391 0375 09", 5000);
            wallet[1] = new R_1_13("Raghad", "mm", "3485 095 1954", 3500);
            wallet[2] = new R_1_13("Raghad", "ll", "5391 87 5309", 2500);


            for (int val = 1; val <= 16; val++) {
                wallet[0].R_1_13(val);
                wallet[1].R_1_13(2*val);
                wallet[2].R_1_13(3*val);
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("Customer: " + wallet[i].getCustomer());
                if (wallet[i].getBalance() > wallet[i].getLimit()) {
                    System.out.println("Credit card with account number " + wallet[i].getAccount() + " has exceeded its credit limit.");
                }
            }
        }
    private String getAccount() {
        return null;
    }

    private boolean getLimit() {
        return false;
    }

    private boolean getBalance() {
        return false;
    }

    private String getCustomer() {
        return null;
    }


}