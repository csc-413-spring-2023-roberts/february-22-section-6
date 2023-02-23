import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
  public static void main(String[] args) throws IOException {
    FileReader reader = new FileReader("sample.txt");

    int character;
    while ((character = reader.read()) != -1) {
      System.out.print((char) character + "[" + character + "] ");
    }
    reader.close();

    reader = new FileReader("sample.txt");

    int readCount = 0;
    char[] buffer = new char[25];
    while ((readCount = reader.read(buffer)) != -1) {
      System.out.println("Read [" + readCount + "] characters:\n" + new String(buffer));
    }

    reader.close();
  }
}
