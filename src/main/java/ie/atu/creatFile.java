package ie.atu;

import java.io.*;
import java.util.Scanner;

public class creatFile {
    public static void main(String[] args) {
            System.out.println("Enter file name");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            File myFile = new File(name);
            System.out.println("My file is located at" + myFile.getAbsolutePath());

            try {
                PrintWriter myWriter = new PrintWriter(new FileWriter("myfile.txt", true));
                myWriter.println("this is my first line");
                myWriter.close();


            }catch (IOException e) {
                e.printStackTrace();
            }

            Scanner inputFile = null;
            try{
                inputFile = new Scanner(new File("myfile.txt"));
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            while (inputFile.hasNext())
            {
                String str = inputFile.nextLine();
                System.out.println(str);
            }

    }
}
