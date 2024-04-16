public class Thread1 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("Running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        // Suspend the thread
        thread.suspend();

        // Do something else

        // Resume the thread
        thread.resume();

	try{
        // Wait for the thread to finish
        thread.join();
}
catch (InterruptedException f)
{
 System.out.println("Exception occured!"+ f);
}
    }
}
