import java.util.ArrayList;
import java.util.List;

// Runnable class to reverse a string
class StringReversalThread implements Runnable {
    private String originalString;
    private String reversedString;
    private int index;
    private List<String> reversedList;

    public StringReversalThread(String originalString, int index, List<String> reversedList) {
        this.originalString = originalString;
        this.index = index;
        this.reversedList = reversedList;
    }
    
    @Override
    public void run() {
        reversedString = new StringBuilder(originalString).reverse().toString();
        synchronized (reversedList) {
            reversedList.set(index, reversedString); 
        }
    }
}

class MultithreadedStringReversal {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};

        List<String> reversedList = new ArrayList<>(strings.length);

        for (int i = 0; i < strings.length; i++) {
            reversedList.add("");
        }
        Thread[] threads = new Thread[strings.length];

        for (int i = 0; i < strings.length; i++) {
            threads[i] = new Thread(new StringReversalThread(strings[i], i, reversedList));
            threads[i].start();
        }

        for (int i = 0; i < strings.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Reversed Strings:");
        for (String reversed : reversedList) {
            System.out.println(reversed);
        }
    }
}
