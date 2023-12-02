import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IO_Counter {

  public static void main(String[] args) throws IOException {
    String file_1 = args[0];

    // IO_Counter_Input_File_1.txt
    FileReader reader = new FileReader(file_1);
    BufferedReader br = new BufferedReader(reader);

    int character_count = 0;
    int word_count = 0;
    int line_count = 0;

    String currentLine = br.readLine();
    while (currentLine != null) {
      line_count++;

      String[] words = currentLine.split(" ");
      word_count += words.length;

      for (String word : words) {
        character_count += word.length();
      }

      currentLine = br.readLine();
    }

    System.out.println("Number of characters: " + character_count);
    System.out.println("Number of words: " + word_count);
    System.out.println("Number of lines: " + line_count);
  }
}
