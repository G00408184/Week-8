package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class creatFile {
    public static void main(String[] args) {


            File myFile = new File("myfile.txt");
            System.out.println("My file is located at" + myFile.getAbsolutePath());

            try {
                PrintWriter myWriter = new PrintWriter(new FileWriter("myfile.txt", true));
                myWriter.println("this is my first line");
                myWriter.close();


            }catch (IOException e) {
                e.printStackTrace();
            }





    }
}
