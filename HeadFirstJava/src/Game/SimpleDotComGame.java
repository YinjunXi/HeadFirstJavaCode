package Game;

/**
 * Created by muhlenXi on 2017/2/27.
 */
import  java.util.ArrayList;
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        ArrayList locations = new ArrayList();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum+1));
        locations.add(String.valueOf(randomNum+2));
        theDotCom.setLocationCells(locations);
        // System.out.println(locations);
        boolean isAlive = true;
        while(isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guess");
            }
        }
    }
}
