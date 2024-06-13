class if_statement{
        public int a = 10;
        public int b = 30;
        public void check_number(){
            if (a == b){
                System.out.println("both number is equal");
            }
            if (a>b){
                System.out.println("a is grater than b");
            }
            if (a<b){
                System.out.println("b is grater then a");
            }
        }
    }
 class if_else_statement{
        public int a = 10;
        public int b = 30;
        public void check_number_equal(){
            if (a==b){
                System.out.println("both a and b are equal ");
            }
            else {
                System.out.println("both are not equal");
            }
        }
    }
class if_else_if_ladder{
        public int a = 10;
        public int b = 20;
        public int c = 30;
        public void grater_then_three_number(){
            if (a>b & a>c){
                System.out.println("a is grater");
            } else if (b>c & b>a){
                System.out.println("b is grater");
            } else if (c>a & c>b) {
                System.out.println("c is grater");
            }
        }
    }
class nested_if{
    public int age = 20;
    public void check() {
        if (age == 1) {
            System.out.println("You ara infant");
            if (age == 10){
                System.out.println("You are kid");
            }
            else if (age == 20){
                System.out.println("You are grown up now");
            }
        }else {
            System.out.println("You are adult");
        }

    }

}
    public class Decision_making_and_looping {
    public static void main(String[] args) {
        if_statement if_sta = new if_statement();
        if_sta.check_number();
        if_else_statement obj = new if_else_statement();
        obj.check_number_equal();
        if_else_if_ladder nie = new if_else_if_ladder();
        nie.grater_then_three_number();
        nested_if ni = new nested_if();
        ni.check();
    }

}

