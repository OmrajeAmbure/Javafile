class Demo1{
    private static int x ;

    static void fun1(){
        x = 10;
        System.out.println(x);
    }
}

class Demo {
    public static void main(String[] args) {
        // Demo1.x => if another class data member is private so it can not access

        Demo1 d1 = new Demo1(); // here we can crate the object of Demo1 class
        d1.fun1();// we can access indirectly of private variable by using function

        Demo1.fun1();// after putting the static keyword before the fun1() then it will access by direct

    }
}
