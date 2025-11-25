

public class Snooze {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] songLyrics = {
            "Snooze by Sza",
            "I can't lose when I'm with you",
            "How can I snooze and miss the moment",
            "You just too important",
            "Nobody do body like you do",
            "I can't lose when I'm with you ",
            "How can I snooze and I miss the moment",
            "You just too important",
            "Nobody do body like you do, you do "
                
        };
        for (String line : songLyrics) {
            System.out.println(line);
            try {
                Thread.sleep(3550);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
