/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author WINDOWS 10
 */
public class TryCatchExample_10 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw;
        
         try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            pw.println("saved");  
        }  
// providing the checked exception handler  
 catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
    System.out.println("File saved successfully");  
    }
}
