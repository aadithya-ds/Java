package file_operations;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try {
            File myobj = new File("filecreation.txt");
            if (myobj.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File alredy exists");
            }

            FileWriter mywriter = new FileWriter("filecreation.txt");
            mywriter.write("Hello world");
            mywriter.close();

            Scanner s = new Scanner(myobj);
            while (s.hasNextLine()) {
                String str = s.nextLine();
                System.out.println(str);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
