package Seminar2;
import java.io.*;

public class task1 {
    

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("file.txt", false)) {
            String text = ("текст! ");
            writer.write(text);
            for (int i = 0; i < 101; i++) {
            }
            
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
