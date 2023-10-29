// A. Shuffle an array

import java.util.Random;

public class JavaTasks {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        System.out.print("Shuffled array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}


// B. Convert a Roman numeral to an integer

import java.util.*;   
import java.io.*;   
import java.lang.Math;  
public class RomanToInteger1  
{   
  int value(char r)   
  {   
    if (r == 'I')   
      return 1;   
    if (r == 'V')   
      return 5;   
    if (r == 'X')   
      return 10;   
    if (r == 'L')   
      return 50;   
    if (r == 'C')   
      return 100;   
    if (r == 'D')   
      return 500;   
    if (r == 'M')   
      return 1000;   
    return -1;   
  }   
  int convertRomanToInt(String s)   
  {   
    int total = 0;   
    for (int i=0; i<s.length(); i++)   
    {   
      int s1 = value(s.charAt(i));   
      if (i+1 <s.length())   
      {   
        int s2 = value(s.charAt(i+1));     
        if (s1 >= s2)   
        {    
          total = total + s1;   
        }   
        else  
        {   
          total = total - s1;   
        }   
      }   
      else  
      {   
        total = total + s1;   
      }   
    }   
    return total;   
  }   
  public static void main(String args[])   
  {   
    RomanToInteger1 ob = new RomanToInteger1(); 
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Roman numeral: ");
    String romanStr = scanner.nextLine();
        
    System.out.println("The corresponding Integer value is: "+ob.convertRomanToInt(romanStr));   
  }   
}



// C. Check if the input is a pangram

import java.util.Random;
import java.util.Scanner;

public class JavaTasks {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        scanner.close();
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                isPresent[index] = true;
            }
        }

        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}