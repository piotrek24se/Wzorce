package builder;

public class House {

    private String window;
    private int doorsNumber;
    private float area;
    private String roof;
    private int roomsNumber;
    private int levelsNumber;
    private boolean isDoorOpen;

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public int getLevelsNumber() {
        return levelsNumber;
    }

    public void setLevelsNumber(int levelsNumber) {
        this.levelsNumber = levelsNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "window='" + window + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", area=" + area +
                ", roof='" + roof + '\'' +
                ", roomsNumber=" + roomsNumber +
                ", levelsNumber=" + levelsNumber +
                '}';
    }

    public static class Builder {

        private String window;
        private int doorsNumber;
        private float area;
        private String roof;
        private int roomsNumber;
        private int levelsNumber;
        private boolean isDoorOpen;

        public Builder() {
        }

        public Builder withWindow(String value) {
            window = value;
            return this;
        }

        public Builder withDoorsNumber(int value) {
            doorsNumber = value;
            return this;
        }

        public Builder withOpenDoors() {
            isDoorOpen = true;
            return this;
        }

        public House build() {
            House house = new House();
            house.isDoorOpen = isDoorOpen;
            house.window = window;
            house.doorsNumber = doorsNumber;
            return house;
        }
    }
}
