package Leran_the_basics;

public class Pattern {
    public void SquarePattern(){
        // task 1 :-
        //          * * * * * *
        //          * * * * * *
        //          * * * * * *
        //          * * * * * *

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        // task 2:-
        //        1 2 3 4  or 1 1 1 1
        //        1 2 3 4     2 2 2 2
        //        1 2 3 4     3 3 3 3
        //        1 2 3 4     4 4 4 4
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print(" "+j);// just replace i to j to print 2 pattern
            }
            System.out.println();
        }
        // task 3 :-
        //      4 3 2 1
        //      4 3 2 1
        //      4 3 2 1
        //      4 3 2 1
        System.out.println();
        for(int i=1;i<=4;i++){
            for (int j=4;j>=1;j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        // task 4:-
        //      1 2 3 or 9 8 7
        //      4 5 6    6 5 4
        //      7 8 9    3 2 1
        System.out.println();
        int var = 1;// we will use external  variable to implement the logic. replace 1 to 9 value to print second pattern
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.print(" "+(var++));// replace the ++ to -- to print second pattern
            }
            System.out.println();
        }
    }
    public void StarShapePattern(){
        // task 1: * * * * *
        //         * * * *
        //         * * *
        //         * *
        //         *
        // 1 pattern --->
        System.out.println();
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.SquarePattern();
        p.StarShapePattern();
    }
}
