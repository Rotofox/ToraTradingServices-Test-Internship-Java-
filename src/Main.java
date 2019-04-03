import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileHandlerTora f = new FileHandlerTora();
        try {
            f.loadFile(); //backup input file
            f.extractCaseNumber();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
