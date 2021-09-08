// A program to define your own custom exception and throw it.

package exception_handling;


class MyException extends Exception {     
	public MyException(String s) {   
   
     super(s);
 }
}


 class CustomException {

	 public static void main(String args[]) {
     try{
        
         throw new MyException("it is my own exception");
     }
     catch (MyException ex){
         System.out.println("Caught");

        
         System.out.println(ex.getMessage());
     }
 }
}
