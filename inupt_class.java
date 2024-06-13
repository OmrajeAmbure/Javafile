import java.util.Scanner;

class Student_record {
    public String name;
    public int age;
    public float last_sem_marks;
    public String email;
    Scanner sc = new Scanner(System.in);

    public void get_student_details() {
        System.out.println("Enter Your Name :- ");
        name = sc.nextLine();
        System.out.println("Enter Your Age :- ");
        age = sc.nextInt();
        System.out.println("Enter last Sem Mark :- ");
        last_sem_marks = sc.nextFloat();
        // Consume the newline character after last_sem_marks input
        sc.nextLine();
        System.out.println("Enter your Email ID :- ");
        email = sc.nextLine();
    }

    public void set_student_details() {
        System.out.println("============================ Student Details ==================================");
        System.out.println("Name of Student :- " + name);
        System.out.println("Age of Student :- " + age);
        System.out.println("Last Semester Marks of Student :- " + last_sem_marks);
        System.out.println("Email ID :-  " + email);
    }
}

class input_class {
    public static void main(String[] args) {
        Student_record sr = new Student_record();
        sr.get_student_details();
        sr.set_student_details();
    }
}
