public class R_1_11 {
        private String customer;
        private String bank;
        private String account;
        private int limit;
        protected double balance;

        public  R_1_11(String customer, String bank, String account, int limit, double balance) {
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
            balance = amount;
        }

        public void updateCreditLimit(int newLimit) {
            limit = newLimit;
        }

        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            R_1_11 card = new  R_1_11("Raghad", "Bank", "1234 5678", 5000, 1000);

            boolean isChargeSuccessful = card.charge(2000);
            System.out.println("Is charge successful? " + isChargeSuccessful);
            System.out.println("Current balance: " + card.getBalance());

            card.makePayment(700);
            System.out.println("Balance after payment: " + card.getBalance());

            card.updateCreditLimit(4000);
            System.out.println("Updated credit limit: " + card.limit);
        }
    }