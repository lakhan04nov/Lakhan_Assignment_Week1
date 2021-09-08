// A program to find the first non-repeated character in it.

package java_8;

public class A1 {
    public static void main(String args[]) {

        String inputStr ="nishi";

        for(char i :inputStr.toCharArray()){
            if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }
}
