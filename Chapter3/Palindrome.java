
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Palindrome
{
  public static void main (String [] args){
      String word;
      int x = 0;
      Scanner scan = new Scanner(System.in);
      System.out.print ("Enter the word: ");

           word = scan.next();
      char firstLetter = word.charAt(x);
      int length = word.length();
      char lastLetter = word.charAt(length - (1 + x));
      if (firstLetter = lastLetter){
          x++;
          char firstLetter = word.charAt(x);

      char lastLetter = word.charAt(length - (1 + x));
        }
      
    }
}
