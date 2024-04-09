import java.io.*;
import java.util.*;

public class Egexc {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Oops! Something went wrong with the math: " + e.getMessage());
        } finally {
            System.out.println("Finally! Math errors are never fun.");
        }

        try {
            int[] array = new int[5];
            int element = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! Looks like we went out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Finally! Be careful with those array indexes.");
        }

        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Oops! Tried to do something with nothing: " + e.getMessage());
        } finally {
            System.out.println("Finally! Null pointers are not your friends.");
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            String line = reader.readLine();
        } catch (IOException e) {
            System.out.println("Oops! Couldn't find that file: " + e.getMessage());
        } finally {
            System.out.println("Finally! File handling can be tricky.");
        }

        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Oops! Expected a number but got something else: " + e.getMessage());
        } finally {
            System.out.println("Finally! Always watch out for unexpected formats.");
        }

        try {
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Oops! Tried to fit a square peg in a round hole: " + e.getMessage());
        } finally {
            System.out.println("Finally! Casting types requires caution.");
        }

        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Oops! Someone's trying to bend the rules: " + e.getMessage());
        } finally {
            System.out.println("Finally! Keep those arguments legal.");
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            list.add("Item 1");
            list.remove("Item 2");
        } catch (IllegalStateException e) {
            System.out.println("Oops! List operations are not in the right state: " + e.getMessage());
        } finally {
            System.out.println("Finally! Lists have to be in the right state for operations.");
        }

        try {
            String str = "example";
            char ch = str.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Oops! Tried to reach beyond the limits: " + e.getMessage());
        } finally {
            System.out.println("Finally! Stay within the boundaries.");
        }

        try {
            int[] array = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Oops! Trying to fit the impossible: " + e.getMessage());
        } finally {
            System.out.println("Finally! Arrays need non-negative sizes.");
        }

        try {
            Class<?> cls = String.class;
            cls.getField("nonexistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("Oops! Field not found: " + e.getMessage());
        } finally {
            System.out.println("Finally! Double-check your field names.");
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            list.add("Item 1");
            list.add("Item 2");
            list.remove(1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Oops! Operation not supported: " + e.getMessage());
        } finally {
            System.out.println("Finally! Some operations are not allowed.");
        }

        try {
            System.setSecurityManager(null);
        } catch (SecurityException e) {
            System.out.println("Oops! Security breach detected: " + e.getMessage());
        } finally {
            System.out.println("Finally! Security is no joke.");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Oops! Interrupted sleep: " + e.getMessage());
        } finally {
            System.out.println("Finally! Sometimes threads need their rest too.");
        }

        try {
            int[] array = new int[Integer.MAX_VALUE];
        } catch (NegativeArraySizeException e) {
            System.out.println("Oops! Trying to make a huge array: " + e.getMessage());
        } finally {
            System.out.println("Finally! Keep those array sizes reasonable.");
        }
    }
}
