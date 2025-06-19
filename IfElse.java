package Leran_the_basics;

//If ElseIf
//        100
//        Easy
//        Hint
//        Given marks of a student, print on the screen:
//
//        Grade A if marks >= 90
//        Grade B if marks >= 70
//        Grade C if marks >= 50
//        Grade D if marks >= 35
//        Fail, otherwise.
//
//        For printing use:-
//
//        for C++ : cout << variable_name;
//        for Java : System.out.print();
//        for Python : print()
//        for Javascript : console.log()
//
//        Examples:
//        Input: marks = 95
//        Output: Grade A
//        Explanation: marks are greater than or equal to 90.
//        Input: marks = 14
//        Output: Fail
//        Explanation: marks are less than 35.
public class IfElse {
    public void studentGrade(int marks){
        if (marks >= 90){
            System.out.println("Grade A");
        }else if(marks >=70){
            System.out.println("Grade B");
        } else if (marks >=50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        IfElse i = new IfElse();
        i.studentGrade(90);
    }
}
