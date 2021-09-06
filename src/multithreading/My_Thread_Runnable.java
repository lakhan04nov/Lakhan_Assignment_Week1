//  A program to create threads by all possible ways.


   // By implement runnable interface.

package multithreading;

class My_Thread_Runnable implements Runnable {  
	public void run(){  
		System.out.println("thread is running with the help of runnable interface.");  
}  
  
	public static void main(String args[]){  
		My_Thread_Runnable m1=new My_Thread_Runnable();  
		Thread t1 =new Thread(m1);  
		t1.start();  
 }  
}  
