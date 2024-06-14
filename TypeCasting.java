class Implicit_Conversion{

//    In this class we can gaven two variable which conversion there value according to the following manner ===>
//    Type :- byte ==> short ==> int ==> long ==> float ==> double  memory used :- 1 byte ==> 2 byte ==> 4 ==> 8 byte ==> 4 byte ==> 8 byte
//    the conversion can be possible according the size of variable , ex., we can not store 8 byte value into 2,4,2 byte variable .

    byte b = 10;
    float c = b; //byte variable can conversion to the float
    short d = b; //byte variable can conversion to the short
    int e = b; //byte variable can conversion to the int
    long f = b;//byte variable can conversion to the long
    double h = b; // byte variable can conversion to the double

    public void Implicit_Conversion_Result(){
        System.out.println("The result of implicit conversion is :- \n");
        System.out.println("byte into float :- "+c);
        System.out.println("byte into short :- "+d);
        System.out.println("byte into int :- "+e);
        System.out.println("byte into long :- "+f);
        System.out.println("byte into double :- "+h);
        System.out.println("\n");
    }

}
class Explicit_Casting{

//    in explicit type casting, we need to casting variable value to cast into another variable
//    Type :- byte <== short <== int <== long <== float <== double  memory used :- 1 byte <== 2 byte <== 4 <== 8 byte <== 4 byte <== 8 byte

    double d = 50.00;
    float c = (float) d; // here we can not pass the float value into double so, we perform the casting operation
    long f = (long)d;// in this case long and double also same memory used 8 byte, but the differance is to long can take integer value it cannot take any decimal value
    short s = (short) d;
    int e = (int) d;
    byte b = (byte) d ;
    public void Explicit_Casting_Result(){
        System.out.println("The result of Explicit Casting is :- \n");
        System.out.println("double into float :- "+c);
        System.out.println("double into short :- "+s);
        System.out.println("double into int :- "+e);
        System.out.println("double into long :- "+f);
        System.out.println("double into byte :- "+b);
        System.out.println("\n");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        Implicit_Conversion imp = new Implicit_Conversion();
        Explicit_Casting exp = new Explicit_Casting();
        imp.Implicit_Conversion_Result();
        exp.Explicit_Casting_Result();
    }
}
