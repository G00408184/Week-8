package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class creatFile {
    public static void main(String[] args) {


            File myFile = new File("myfile.txt");
            System.out.println("My file is located at" + myFile.getAbsolutePath());
            try {
                FileWriter myWriter = new FileWriter(myFile);
                myWriter.write("this is my first line");
                myWriter.close();

            }catch (IOException e)
            {
                e.printStackTrace();
            }





    }
}
