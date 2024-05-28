class NumberChecker implements Runnable {
    private int number;

    NumberChecker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

public class OddEvenChecker {
    public static void main(String[] args) {
        int numberToCheck = 5; // Change this number to test with different numbers

        NumberChecker checker = new NumberChecker(numberToCheck);
        Thread thread = new Thread(checker);
        thread.start();
    }
}
