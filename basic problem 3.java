public class Test {
	Test(){
	        this(10);
	        System.out.println("Hi");
 	}
	Test(int a){
	       this(10,20);
	       System.out.println("Hello");
	 }
	 Test(int a , int b){
	       System.out.println("Bye");
	       System.out.println(a*b);
     }
	public static void main(String[] args) {
		   new Test();		  
	}
}