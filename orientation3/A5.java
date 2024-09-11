public class Clock {
    private static Clock instance;
    private long currentTime;

    private Clock() {
        this.currentTime = System.currentTimeMillis();
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public void setTime(long newTime) {
        this.currentTime = newTime;
    }

    public long getTime() {
        return this.currentTime;
    }

    public static void main(String[] args) {
        Clock clock1 = Clock.getInstance();
        System.out.println("Clock 1 time: " + clock1.getTime());

        clock1.setTime(1694428800000L); 
        System.out.println("Updated Clock 1: " + clock1.getTime());

        Clock clock2 = Clock.getInstance();
        System.out.println("New Clock 2 time: " + clock2.getTime()); 
    }
}
