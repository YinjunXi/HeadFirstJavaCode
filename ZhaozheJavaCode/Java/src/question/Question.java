package question;

/**
 * Created by Zhaozhe on 03/10/2016.
 */
public class Question {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print1();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print2();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print3();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print4();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print5();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print6();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print7();
        i++;

        System.out.println("--------------");
        System.out.println("第 " + i + " 题");
        print8();
        i++;

    }

    /*
     *  .   输出效果
     *      * * * * *
     *      * * * *
     *      * * *
     *      * *
     *      *
     */
    public static void print1(){

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 - i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
     *  .   输出效果
     *              *
     *            * *
     *          * * *
     *        * * * *
     *      * * * * *
     */
    public static void print2(){

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 - i; j++) {

                System.out.print("  ");
            }
            for (int j = 0; j < i+1; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
     *  .   输出效果
     *          *
     *        * * *
     *      * * * * *
     */
    public static void print3(){

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *  .   输出效果
     *      * * * * *
     *        * * *
     *          *
     */
    public static void print4(){

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*(3-i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     *  .   输出效果
     *      * * * * *
     *        * * *
     *          *
     *        * * *
     *      * * * * *
     */
    public static void print5(){

        for (int i = 0; i < 5; i++) {

            if (i <= 5/2) {
                for (int j = 0; j < i ; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 5-i*2; j++) {
                    System.out.print("* ");
                }

            } else {
                for (int j = 0; j < 4-i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2*i-3; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

    }

    /*
     *  .   输出效果
     *      * * * * *
     *      *       *
     *      *       *
     *      *       *
     *      * * * * *
     */
    public static void print6(){

        int number = 5;
        for (int i = 0; i < number; i++) {

            for (int j = 0; j <number ; j++) {

                if (j > 0 && j < number-1 && i !=0 && i!= number-1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    /*
     *  .   输出效果
     *      * * * * *
     *        *   *
     *          *
     *        *   *
     *      * * * * *
     */
    public static void print7(){

        for (int i = 0; i < 5; i++) {

            switch (i) {
                case 0:
                    System.out.println("* * * * *");
                    break;
                case 1:
                    System.out.println("  *   *  ");
                    break;
                case 2:
                    System.out.println("    *    ");
                    break;
                case 3:
                    System.out.println("  *   *  ");
                    break;
                case 4:
                    System.out.println("* * * * *");
                    break;
            }
        }

    }

    /*
     *  .   输出效果
     *          * * *
     *          * *
     *          *
     *        * *
     *      * * *
     */
    public static void print8(){

        int number = 5;
        for (int i = 0; i < number; i++) {

            if ( i <= number/2) {
                System.out.print("    ");
                for (int j = 0; j < 3-i; j++) {

                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < 4-i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < i/2+1; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
