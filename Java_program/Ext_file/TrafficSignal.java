class TrafficLight implements Runnable {
    private String lightName;
    private String[] colors = {"RED", "GREEN", "YELLOW"};
    private int delay;

    TrafficLight(String lightName, int delay) {
        this.lightName = lightName;
        this.delay = delay;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for (String color : colors) {
                    System.out.println(lightName + " light is " + color);
                    Thread.sleep(delay);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(lightName + " light stopped.");
        }
    }
}

public class TrafficSignal {
    public static void main(String[] args) {
        System.out.println("Traffic signal system started.");

        TrafficLight light1 = new TrafficLight("Main Street", 3000);
        TrafficLight light2 = new TrafficLight("Side Street", 2000);

        Thread thread1 = new Thread(light1);
        Thread thread2 = new Thread(light2);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
        thread2.interrupt();

        System.out.println("Traffic signal system stopped.");
    }
}
