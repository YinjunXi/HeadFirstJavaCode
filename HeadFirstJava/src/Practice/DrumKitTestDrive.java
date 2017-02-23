package Practice;

/**
 * Created by yangxi on 2017/2/23.
 */
public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = true;
        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }

}
