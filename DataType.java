import java.lang.*;
public class DataType {
    public static void main(String[] args) {

        byte b = -12;
        System.out.println("byte variable b = "+b);
        // The byte data type can store whole numbers from -128 to 127
        // byte = 1

        short s = 5000;
        System.out.println("The Short Variable s = "+s);
        // Stores whole numbers from -32,768 to 32,767
        // 	2 bytes

        int a = 20;
        System.out.println("The int variable a = "+a);
        // The int data type can store whole numbers from -2147483648 to 2147483647
        // byte = 4 and 32 bits

        long l = 723542768;
        System.out.println("The long variable l = "+l);
        // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // 8 bytes

        float f = 20.0f;
        System.out.print("The float f = "+f);
        // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // A floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515
        // 4 bytes

        double d = 500.1354325d;
        System.out.println("The double d = "+d);
        // 15 decimal digits store value
        // A floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515
        // 8 bytes

        char c = 'D';
        char ascii = 56;
        System.out.println("The char variable store only one character c = "+c);
        System.out.println("The char variable also store ASCII value 56 = "+ascii);
        // 2 bytes
        // Stores a single character/letter or ASCII values

    }
}
