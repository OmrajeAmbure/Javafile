package CollectionFramework;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Iterator;
public class ListDemo {
    // ArrayList is class which to implement List Interface present in  java.util. Package.
    // ArrayList Can store different Type of data
    // ArrayList can store Duplicate data also
    // ArrayList is a index base data structure
    // ArrayList follows insertion order
    // ArrayList san store no.of null values

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        LinkedList li =new LinkedList();
        Vector v = new Vector();
        // 1. ArrayList Method
        System.out.println("ArrayList --> ");
        System.out.println(al.add(10));// return type is boolean
        System.out.println(al.add(29));
        System.out.println(al.add(30));
        al.add("om");
        al.add("rohit");
        al.add('c');
        al.add(true);
        al.add(2,60);
        al.remove(5);
        al.remove("om");
        al.add(null);
        al.add(null);
        al.add(null);
        Iterator list =  al.iterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
        list.forEachRemaining(i -> System.out.println(i));
//        al.forEach(i -> System.out.println(i));

        // 2. LinkedList Method
        System.out.println("\nLinkedList --> ");
        li.add("om");
        li.add("sham");
        li.add(23);
        li.add(null);
        li.add(null);
        li.add("sham");
        li.remove(null);
        li.remove(1);
        li.forEach(i -> System.out.println(i));

        // 3. Vector Method
        System.out.println("Vector --> ");
        v.add("om");
        v.add(23);
        v.add(true);
        v.add(null);
        v.add('c');
        v.remove(1);
        v.forEach(i -> System.out.println(i));

        // 4. Stack Method
        System.out.println("Stack Method --> ");
        Stack s = new Stack();
        s.push(21);
        s.push("om");
        s.push('o');
        System.out.println(s.pop());// remove Default last index
        System.out.println(s.isEmpty());// return true or false value
        System.out.println(s.add(45));// add element on top
        System.out.println(s.peek());
        s.forEach(i-> System.out.println(i));
        System.out.println(s);
    }
}
