public class Stopwatch {
    private double startTime, endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void StopWatch (double startTime) {
        this.startTime = startTime;
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        double now = System.currentTimeMillis();
        return (now - startTime) / 1000;
    }
}
