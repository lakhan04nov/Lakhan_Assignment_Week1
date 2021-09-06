// A program for Synchronization block.

package multithreading;


import java.io.*;
import java.util.*;


class Sample {
	public void send(String msg){
     System.out.println("Sending\t"  + msg );
     try
     {
         Thread.sleep(1000);
     }
     catch (Exception e)
     {
         System.out.println("Thread  interrupted.");
     }
     System.out.println("\n" + msg + "Sent");
 }
}


class ThreadedSend extends Thread{
 private String msg;
 Sample  sender;

  ThreadedSend(String m,  Sample obj){
     msg = m;
     sender = obj;
 }

 public void run() {
     
     synchronized(sender)
     {
         
         sender.send(msg);
     }
 }
}


class Sender {
 public static void main(String args[]){
     Sample snd = new Sample();
     ThreadedSend S1 =
         new ThreadedSend( " Hi " , snd );
     ThreadedSend S2 =
         new ThreadedSend( " Bye " , snd );

     // Start two threads of ThreadedSend type
     S1.start();
     S2.start();

    
     try
     {
         S1.join();
         S2.join();
     }
     catch(Exception e){
         System.out.println("Interrupted");
     }
 }
}
