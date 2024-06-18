import java.util.Scanner;

public class positive_or_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number (to check The positive or negative) :-  ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Number Is Negative");
        }
        else if (num > 0){
            System.out.println("Number Is Positive");
        }
        else if(num == 0){
            System.out.println(num+" is Zero it can not positive or not negative");
        }
        else {
            System.out.println("You are not enter valid number");
        }
    }
}
