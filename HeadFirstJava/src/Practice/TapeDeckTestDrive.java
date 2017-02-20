package Practice;

/**
 * Created by yangxi on 2017/2/16.
 */
public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();
        }
    }

}
