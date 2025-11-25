import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Invisible {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        singSong();
    }

    public static void animateText(String text, long delay) {
        lock.lock();
        try {
            for (char c : text.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(delay);
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public static void singSong(String lyric, long delay, long speed) {
        try {
            Thread.sleep(delay);
            animateText(lyric, speed);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void singSong() {
        String[][] lyrics = {
            {"\ntrust the one", "100"},
            {"who's been where you are", "10"},
            {"wishing all it was sticks and stones", "10"},
            {"yeah, those words cut deep", "10"},
            {"but they don't mean your're all alone", "10"},
            {"and you're not invisible", "10"},
            {"hear me out there's so much more", "10"},
            {"of this life than what", "10"},
            {"you're feeling now", "10"},
            {"and someday you'll look back", "10"},
            {"on all this days and all this pain is gonna be", "10"},
            {"invisible", "10"}
        };
        
        long[] delays = {300, 3900, 6000, 7500, 10500, 15000, 17000, 19400, 22400, 25500, 27000, 33300};

        ExecutorService executor = Executors.newFixedThreadPool(lyrics.length);
        for (int i = 0; i < lyrics.length; i++) {
            final int index = i;
            executor.submit(() -> singSong(lyrics[index][0], delays[index], Long.parseLong(lyrics[index][1])));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }
    }
}

