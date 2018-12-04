package factory;

public class SimpleFactory {

    public static void main(String[] args) {
        System.out.println(ButterFactory.createBioButter(72, 250));
        System.out.println(ButterFactory.createNotBioButter(72, 250));
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

        public void setFat(int fat) {
            this.fat = fat;
        }

        public boolean isBio() {
            return bio;
        }

        public void setBio(boolean bio) {
            this.bio = bio;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
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