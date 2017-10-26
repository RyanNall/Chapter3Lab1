
/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
      public static void main (String[] args) {

      // print main table
      for (int i = 1; i <= 12; i++) {
          if ( i < 10){
             
         System.out.print(i + " |");
        }
        else{
            System.out.print(i + "|");
        }
         for (int j = 1; j <= 12; j++) {
            if ( (i*j) < 10){
                System.out.print(i*j + "   ");
            }
             else if ( ((i*j) >= 10) && ((i*j) < 100)){
                System.out.print(i*j + "  ");
            }
            else{
                System.out.print(i*j + " ");
            }
            
         }
         System.out.println();
      }
   } // end of main
}