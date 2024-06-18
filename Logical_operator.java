import java.util.Scanner;

public class Logical_operator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Age :- ");
        int age = inp.nextInt();
        System.out.println("Your are Female (TRUE or FAlSE) :- ");
        boolean isfemale = inp.nextBoolean();

        if (age < 5){
            System.out.println("You got 75% Discount ");
        } else if (isfemale) {
            System.out.println("You got 50% Discount ");
        } else if (age > 60 && !isfemale) {
            System.out.println("you got 70% Discount ");
        }
    }
}
