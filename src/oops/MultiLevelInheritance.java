// A program on Multilevel inheritance.

package oops;


class Car {
   public Car()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
  class Maruti extends Car {
   public Maruti()               //  by defalt super() called...jab bhi kisi constructor ko banate h to ki subclass ka object namaya to sabse pehle sub class ka const. call hoga 
   {
	System.out.println("Class Maruti");    // constructor ki pehlli line by dealt super(() hoti h to wo  construke ctor cal hone se pehle apni super class 
	
   }                                       //    ke constructor ko call karta h......
   public void brand()
   {
	
	  System.out.println("Brand: Maruti");
   }
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}
 class MultiLevelInheritance extends Maruti {

   public MultiLevelInheritance()
   {
	System.out.println("Maruti Model: 800");
   }
   public void speed()
   {
	System.out.println("Max: 80Kmph");
   }
   public static void main(String args[])
   {
	   MultiLevelInheritance obj=new MultiLevelInheritance();
	 obj.vehicleType();
	 obj.brand();
	 obj.speed();
   }
}
