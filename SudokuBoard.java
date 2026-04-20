import java.util.*;
import java.io.*;
 
public class SudokuBoard {
   private char[][] array;
 
   public SudokuBoard(String name) throws FileNotFoundException {
      array = new char[9][9];
      File file = new File(name);
      Scanner input = new Scanner(file);
      int r = 0;
      while (input.hasNextLine()) {
         String line = input.nextLine();
         for (int c = 0; c < array[r].length; c++) {
            if (line.charAt(c) == '.') {
               array[r][c] = ' ';
            } else {
               array[r][c] = line.charAt(c);
            }
         }
         r++;
      }
   }
 
   public String toString() {
      String a = "";
      for (int r = 0; r < array.length; r++) {
         for (int c = 0; c < array[r].length; c++) {
            a += array[r][c] + " ";
         }
         a += "\n";
      }
      return a;
   }
}