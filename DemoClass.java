class DemoClass2{
	void fun1(){
		System.out.println(" non static function 1 ");
	}
	void fun2(){
		System.out.println(" non static function 2 ");
	}
}

class DemoClass1{
	static void fun1(){
		System.out.println(" static function 1 ");
	}
	static void fun2(){
		System.out.println(" static function 2 ");
	}
}


class DemoClass{

	static void  fun1(){
		System.out.println("fun1 ");
	}
	static void  fun2(){
		System.out.println("fun2 ");
	}
	public static void main(String []args){
		System.out.println("hi, I am omraje");
		fun1();
		fun2();

		DemoClass1.fun1();// this method is static so it well call without object 
		DemoClass1.fun2();// this method is static so it well call without object 

		// DemoClass2.fun1();this method is not static so it wll not call without crating instance/object .
		// DemoClass2.fun2();

		DemoClass2 d1 = new DemoClass2();// here we can crate the new object of class which help to call the data member and member Function.
		d1.fun1(); // here we can access DemoClass2 Function by using object/instance
		d1.fun2();
	}
	
}
