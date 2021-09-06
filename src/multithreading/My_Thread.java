//  A program to create threads by all possible ways.
   
  // By extends Thread class.

package multithreading;


public class My_Thread extends Thread{
    public void run(){
     System.out.println("Thread started running with the help of thread class");
    }
    public static void main( String args[] ){
       My_Thread mt = new  My_Thread();
       mt.start();
    }
}