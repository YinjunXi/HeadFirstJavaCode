package Game;
/**
 * Created by muhlenXi on 2017/2/25.
 */
import java.util.ArrayList;
public class DotCom {
    private ArrayList<String> locationCells;
    // int numberOfHits = 0;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);
        return  result;
    }
}
