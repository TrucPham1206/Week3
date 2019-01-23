/*
 * Truc Pham
 * Student ID: 991511456
 * SYST10199 - Web Programming
 */
package softwareclass1;
import java.util.Scanner;
/**
 *
 * @author phamt
 */
public class SoftwareClass1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     /*   String [] name = {"H","E","L","L","O"};
 
        for(int n=0;n<name.length;n++){
            System.out.print(name[n]);
            
    }*/
     /*char[] a =new char [5];
     a [0] = 'h';
     a [1] = 'e';
     a [2] = 'l';
     a [3] = 'l';
     a [4] = 'o';
     for (int i=0; i<a.length; i++){
         System.out.print(a[i]);
     }
     System.out.println("");
     for (int i = a.length-1;i >= 0; i--){
         System.out.print(a[i]);
     }*/
     Scanner data = new Scanner (System.in);
     String word = data.nextLine();
     char [] a =new char[word.length()];
     System.out.print("Enter a sentence: ");
     for (int i = 0; i < word.length(); i++){
     a[i]=word.charAt(i);
     System.out.print("Your sentence: " + a[i]);
     }
    } 
}
