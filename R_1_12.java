public class R_1_12 {
        private String customer;
        private String bank;
        private String account;
        private int limit;
        protected double balance;

        public R_1_12(String customer, String bank, String account, int limit, double balance) {
            this.customer = customer;
            this.bank = bank;
            this.account = account;
            this.limit = limit;
            this.balance = balance;
        }
        public boolean charge(double price) {
            if (price + balance > limit) {
                return false;
            }
            balance += price;
            return true;
        }

        public void makePayment(double amount) {
            if (amount > 0) {
                balance -= amount;
            } else {
                System.out.println("Invalid payment amount. Payment amount cannot be negative.");
            }
                }
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            R_1_12 card = new R_1_12("Raghad", "Bank", "1234 567", 5000, 1000);

            card.makePayment(500);
            System.out.println(card.getBalance());

            card.makePayment(-200);
            System.out.println( card.getBalance());
        }
    }