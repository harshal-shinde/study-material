package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileData {
 public static void main(String[] args) throws FileNotFoundException {
    //creating File instance to reference text file in Java
    File text = new File("/Users/admin/learn/github/interview-prep/code/input.txt");
     
    //Creating Scanner instance to read File in Java
    Scanner scnr = new Scanner(text);
 
    //Reading each line of the file using Scanner class
   
    while(scnr.hasNextLine()){
        String line = scnr.nextLine();
        //this array contains all elements from 1 row sepearted by space
        String[] splittedString  = line.split(" ");
        
        if(splittedString[0] !=null) {
          System.out.println("Buisness Partner = "+ splittedString[0].substring(0, 5));
          System.out.println("Consolidate company = "+ splittedString[0].substring(6, 8));
          System.out.println("Indicator = "+ splittedString[0].substring(9, 15));
        }
        
    }  

  }
}
