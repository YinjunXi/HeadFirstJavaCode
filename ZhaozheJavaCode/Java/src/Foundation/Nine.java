package Foundation;

/**
 * Created by yangxi on 2016/11/17.
 */
public class Nine {

    public static void main(String[] args) {

        for (int i = 0; i < 9 ; i++) {
            int op1 = i + 1;
            for (int j = i; j < 9; j++) {
                int op2 = j + 1;
                System.out.print(op1);
                System.out.print(" x ");
                System.out.print(op2);
                System.out.print(" = ");
                System.out.print(op1 * op2);
                if (op2 < 9) {
                    System.out.print(" ,");
                }

            }
            System.out.println();
        }
    }
}
