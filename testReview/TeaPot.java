public class TeaPot {
    private boolean teaReady;
    private int currentTime;
    private int startTime;
    private int steepTime;

    public TeaPot(boolean done) {
        this.teaReady = done;
    }

    public boolean teaReady() {
        if (currentTime - startTime > steepTime) {
            return true;
        }
        return false;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public String getTeapotColor() {
        return "Blue";
    }
}
