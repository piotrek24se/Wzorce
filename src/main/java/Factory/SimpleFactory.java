package Factory;

public class SimpleFactory {

    //uzupelnic git

    public static void main(String[] args) {

    }

    static class ButterFactory {
        static Butter createBioButter(int fat, int weight) {
            return new Butter(fat, true, weight);
        }

        static Butter createNotBioButter(int fat, int weight) {
            return new Butter(fat, false, weight);
        }
    }

    static class Butter {
        int fat;
        boolean bio;
        int weight;

        public Butter(int fat, boolean bio, int weight) {
            this.fat = fat;
            this.bio = bio;
            this.weight = weight;
        }

        public int getFat() {
            return fat;
        }

        public boolean isBio() {
            return bio;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Butter{" +
                    "fat=" + fat +
                    ", bio=" + bio +
                    ", weight=" + weight +
                    '}';
        }
    }

}
