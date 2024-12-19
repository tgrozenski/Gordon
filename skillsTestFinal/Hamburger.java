class Hamburger {
    boolean eaten;
    String breadType;
    int patties;

    Hamburger(boolean eaten, String breadType, int patties) {
        this.eaten = eaten;
        this.breadType = breadType;
        this.patties = patties;
    }

    public boolean getEaten() {
        return this.eaten;
    }

    public String getBreadType() {
        return this.breadType;
    }

    public int getPatties() {
        return this.patties;
    }
}