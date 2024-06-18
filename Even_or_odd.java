import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter The Number (to check the number is even or odd) :- ");
        int num = inp.nextInt();

        if (num%2==0){
            System.out.println("Number is Even ");
        } else if (num%2==1) {
            System.out.println("Number is Odd  ");
        } else if (num<0){
            System.out.println("Number is negative ");
        } else {
            System.out.println("Number is not valid");
        }
    }
}
