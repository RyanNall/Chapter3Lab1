
/**
 * Write a description of class StarVariations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class StarVariations
{
   public static void main (String[] args) {
       drawA(10, 10);
       drawB(10, 10);
       drawC(10, 10);
    }
  public static void drawA (int r, int c){
       // int c = 10;
     for ( int i = 0; r > i; i++){
      for ( int x = c; x > 0; x--){
     System.out.print("*");
    }
    System.out.println();
    c--;
   }
  }
  
  
  public static void drawB (int r, int c) {
    //  int c = 10;
     for ( int i = 0; r > i; i++){
      for ( int x = c; x > 0; x--){
     System.out.print(" ");
    }
    for ( int x = 10 - c; x > 0; x--){
        System.out.print("*");
    }
    System.out.println();
    c--;
   }
    }
  public static void drawC (int r, int c) {
    //  int c = 10;
     for ( int i = 0; r > i; i++){
         for ( int x = 10 - c; x > 0; x--){
        System.out.print(" ");
    }
      for ( int x = c; x > 0; x--){
     System.out.print("*");
    }
    
    System.out.println();
    c--;
   }
    }
   public static void drawD (int r, int c) {
    //  int c = 10;
     for ( int i = r/2; i > 0; i--){
      System.out.print(" ");
    }
    for ( int i = 10 - r; i > 0; i--){
      System.out.print("*");
    }
    for ( int i = r/2; i > 0; i--){
      System.out.print(" ");
    }
    
    System.out.println();
    c--;
  }
  }
  