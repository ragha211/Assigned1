import com.sun.jdi.PathSearchingVirtualMachine;

public class R_1_10 {
    public static void main(String[] args) {

    }
        private String name;
        private int numberOfPetals;
        private float price;

        public R_1_10(String name, int numberOfPetals, float price) {
            this.name = name;
            this.numberOfPetals = numberOfPetals;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumberOfPetals(int numberOfPetals) {
            this.numberOfPetals = numberOfPetals;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getNumberOfPetals() {
            return numberOfPetals;
        }

        public float getPrice() {
            return price;
        }

    @Override
    public String toString() {
        return "R_1_10{" +
                "name='" + name + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", price=" + price +
                '}';
    }

    }
