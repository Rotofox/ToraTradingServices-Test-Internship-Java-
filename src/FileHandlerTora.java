import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHandlerTora {
  private int numberOfCases = 0;
  private int S = 0;
  private int P = 0;
  private int Day = 0;
  private int Tp = 0;
  private List<Integer> dailyPrice = new ArrayList<>(Day);
  public static void loadFile() throws IOException {
    InputStream is = null;
    OutputStream os = null;
    try {
        Files.deleteIfExists(Paths.get("data/input.in"));
        is = new FileInputStream("data/input_v1.in");
        os = new FileOutputStream("data/input.in");
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
          os.write(buffer, 0, length);
        }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
    finally {
      try {
        is.close();
        os.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public int extractCaseNumber() throws IOException {
    File filename = new File("data/input.in");
    int lol;
    try (BufferedReader r = new BufferedReader(new FileReader(filename))) {
      String line;
      line = r.readLine();
      lol = Integer.parseInt(line.replaceAll("\\D+",""));
      this.numberOfCases = lol;
      System.out.println(this.numberOfCases);
      r.close();
      deleteLine();
    } catch (FileNotFoundException e) {
      System.out.println("!!! File not found: " + filename);
    }
    return 0;
  }

  public static void deleteLine() throws IOException {
    try {
      File inputFile = new File("data/input.in");
      File tempFile = new File("data/myTempFile.in");

      BufferedReader reader = new BufferedReader(new FileReader(inputFile));
      BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

      String line = reader.readLine();
      String lineToRemove = line;
      String currentLine;

      while((currentLine = reader.readLine()) != null) {
        // trim newline when comparing with lineToRemove
        String trimmedLine = currentLine.trim();
        if(trimmedLine.equals(lineToRemove)) continue;
        writer.write(currentLine + System.getProperty("line.separator"));
      }
      writer.close();
      reader.close();
      inputFile.delete();
      tempFile.renameTo(inputFile);
    } catch (FileNotFoundException e) {
        e.getMessage();
    }
  }

  public void bla() throws IOException {
    String line;
    File lol = new File("data/input.in");
    BufferedReader r = new BufferedReader(new FileReader(lol));
    line = r.readLine();
      for (int j = 0; j < 6; j++) {
        if (line.isEmpty()) {
          continue;
        } else {
          line = r.readLine();
          this.S = Integer.parseInt(line.replaceAll("\\D+",""));
          line = r.readLine();
          this.P = Integer.parseInt(line.replaceAll("\\D+",""));
          line = r.readLine();
          this.Day = Integer.parseInt(line.replaceAll("\\D+",""));
          line = r.readLine();
          this.Tp = Integer.parseInt(line.replaceAll("\\D+",""));
          line= r.readLine();
          this.dailyPrice = ;
        }
      }
  }

  public void bleh() {
    // do stuff with S
    // do stuff with P
    //etc
    try {
      bla();
    }catch (IOException e) {
      e.getMessage();
    }
  }


}

