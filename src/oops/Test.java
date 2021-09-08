 // A program on Multiple inheritance not supported.

package oops;


//First Parent class
class Parent1{
	void fun()
	{
		System.out.println("Parent1");
	}
}

//Second Parent Class
class Parent2{
	void fun()
	{
		System.out.println("Parent2");   
	}
}

class Test extends Parent1, Parent2{     // jis class ka object banaya h to non static method km case me control  wo pehle usi class
	                                        //me method search karega jis class ka object banaya h.
public static void main(String args[])
{
	Test t = new Test();
	t.fun();
}
}