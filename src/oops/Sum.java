//A program to demonstrate method overloading.

package oops;

public class Sum {

	
	public int show(int x, int y){
		return (x + y);
	}

	
	public int show(int x, int y, int z){
		return (x + y + z);
	}

	
	public double show(double x, double y){
		return (x + y);
	}

	
	public static void main(String args[])
	{
		Sum s = new Sum();
		System.out.println(s.show(10, 20));
		System.out.println(s.show(10, 20, 30));
		System.out.println(s.show(10.5, 20.5));
	}
}

