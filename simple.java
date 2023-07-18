class Student {
     int id;
     String name;
     void display (int id , String name)
     { 
             System.out.println("ID :- "+id);
             System.out.println("Name :- "+name);
     }
     public static void main (String args[])
     {
         Student s1 = new Student ();
         Student s2 = new Student ();
         s1.display(2115470060,"Omraje");
         s2.display(2115470058,"Ganesh");
    }
}