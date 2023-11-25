public class R_1_2 {
        private int score;

        public R_1_2(int score) {
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public R_1_2 clone() {
            try {
                return (R_1_2) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }

        public static void main(String[] args) {
            R_1_2[] x = new R_1_2[5];
            R_1_2[] y= new R_1_2[5];
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i].clone();
            }

            x[2].setScore(300);

            System.out.println(y[4].getScore());
        }   }