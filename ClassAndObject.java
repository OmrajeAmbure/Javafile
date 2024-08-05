class Nokia{
    // in java we cannot declare private and protected
    private int mic;
    private int cam;
    void setData(){
        mic = 2;
        cam = 28;
    }
    void display(){
        System.out.println(mic);
        System.out.println(cam);
    }
}
class ClassAndObject {
    static void fun1(){
        System.out.println("A");
    }
    static void fun2(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        Nokia nokia = new Nokia();
        nokia.setData();
        nokia.display();
        fun1(); // in this program we cannot call the default method directly, so we can put before function static keyword and call it.
        fun2();
    }
}
