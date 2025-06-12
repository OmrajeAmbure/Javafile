package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    //Set is an interface which implement the following classes : 1.HashSet 2.HashLinkedSet 3.TreeSet
    // HashSet is collection of Object/element which is unordered/different type of data
    // HashSet can not allow duplicate Data
    // HashSet can not follow indexing
    // HashSet can store data using HashCode value
    // HashSet can store one null value
    // HashSet extends to the AbstractSet Class
    // HashSet internally used HashMap...
    public static void main(String[] args) {

        HashSet set = new HashSet();
        LinkedHashSet lhs =  new LinkedHashSet();
        TreeSet ts = new TreeSet();
        // HashSet Method
        System.out.println("\nHashSet--->");
        set.add("om");
        set.add(34);
        set.add('e');
        set.add(true);
        set.add(null);
        set.add(null);
        set.add(34);
        set.isEmpty();//return true or false value
        System.out.println(set.contains("om"));// return true or false value
        System.out.println(set.equals("om")); // return true or false value
        System.out.println(set.size());
        System.out.println(set.remove('e'));
        System.out.println(set);
        set.clear();

        // LinkedHashSet Method
        System.out.println("\nLinkedHashSet--->");
        lhs.add("om");
        lhs.add(34);
        lhs.add('e');
        lhs.add(true);
        lhs.add(null);
        lhs.add(null);
        lhs.add(34);
        lhs.isEmpty();//return true or false value
        System.out.println(lhs.contains("om"));// return true or false value
        System.out.println(lhs.equals("om")); // return true or false value
        System.out.println(lhs.size());
        System.out.println(lhs.remove('e'));
        System.out.println(lhs);// output is : [om, 34, true, null] it means insertion Order followed this

        // TreeSet Method
        System.out.println("\nLinkedHashSet--->");
        ts.add("om");
        ts.add(34);
        ts.add('e');
        ts.add(true);
        ts.add(null);
        ts.add(null);
        ts.add(34);
        ts.isEmpty();//return true or false value
        System.out.println(ts.contains("om"));// return true or false value
        System.out.println(ts.equals("om")); // return true or false value
        System.out.println(ts.size());
        System.out.println(ts.remove('e'));
        System.out.println(ts);
    }
}
