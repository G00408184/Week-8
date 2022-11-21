package ie.atu;

import java.io.File;

public class creatFile {
    public static void main(String[] args) {

        {
            File myFile = new File("myfile.txt");
            System.out.println("My file is located at" + myFile.getAbsolutePath());


        }
    }
}
