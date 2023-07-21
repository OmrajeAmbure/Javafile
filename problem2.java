import java.util.*;

class Multiplication {
public static void main(String[] args){
    
    int n ,result;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr your number :- ");
    n = sc.nextInt();

    for (int i = 1; i<=10;i++){
         System.out.println(+n  +"×"  +i  +"=" +(+n * +i));
    }
    }
}