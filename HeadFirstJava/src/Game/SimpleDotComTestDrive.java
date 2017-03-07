package Game;
import java.util.ArrayList;
/**
 * Created by muhlenXi on 2017/2/25.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        ArrayList list  = new ArrayList();
        list.add("2");
        list.add("3");
        list.add("4");
        dot.setLocationCells(list);

        String userGuess = "2";
        String reslt = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (reslt.equals("hit")) {;
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
