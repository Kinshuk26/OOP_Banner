/* 
@version 5.0
@autor Kinshuk
 */
public class HelloWorld {
 public static void main(String args[]){
    String[] lines = {
     String.join("","   ***   " , "  " , "   ***  " , "  " , " ****** " , "  " , "   *****"),
     String.join(""," **   **" , "  " , "  **   **" , "  "  , " **   **" , "  " , " **"),
     String.join("","**     **" , "  " , "**     **" , "  " , "**   **" , "  ", "**"),
     String.join("","**     **" , "  " , "**     **" , "  " , "****** " , "  " , "  *****"),
     String.join("","**     **" , "  " ,  "**     **" , "  ", "**    " , "  " , "      **"),
     String.join(""," **   **" , "  " , "  **   **" , "  "  , " **    " , "  " , " **   **"),
     String.join("","   ***   " , "  " , "   ***   " , "  " , "**    " , "  " , "  *****    "),
    };
     for (String line : lines){
        System.out.println(line); 
     }
    }
}