import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO_Diff_Checker {

  public static void main(String[] args) throws IOException {
    String file_1 = args[0];
    String file_2 = args[1];


    // FileReader reads the contents from file
    // BufferedReader converts the content to Character Stream
    // later converted to String for further processing

    // IO_Diff_Checker_File_1.txt
    FileReader fr_1 = new FileReader(file_1);
    BufferedReader reader_1 = new BufferedReader(fr_1);

    // IO_Diff_Checker_File_2.txt
    FileReader fr_2 = new FileReader(file_2);
    BufferedReader reader_2 = new BufferedReader(fr_2);

    String currentLine_1 = reader_1.readLine();
    String currentLine_2 = reader_2.readLine();

    int line = 0;
    
    System.out.println("Differences between 2 files: ");
    while (currentLine_1 != null && currentLine_2 != null) {
      line++;
      if (!currentLine_1.equals(currentLine_2)) {
        if (currentLine_1.length() == 0 && currentLine_2.length() > 0) {
          System.out.println("File 2 >>> " + currentLine_2 + " Line: " + line);
        } 
        else if (currentLine_2.length() == 0 && currentLine_1.length() > 0) {
          System.out.println("File 1 >>> " + currentLine_1 + " Line: " + line);
        } 
        else {
          System.out.println("File 1 >>> " + currentLine_1 + " Line: " + line);
          System.out.println("File 2 >>> " + currentLine_2 + " Line: " + line);
        }
      }
      System.out.println();

      currentLine_1 = reader_1.readLine();
      currentLine_2 = reader_2.readLine();
    }
  }
}
