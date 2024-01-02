package file_operations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Inputoutputstrem {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("filecreation.txt");
            String str = "FILE INPUT OUTPUT STREAM";

            byte[] b = str.getBytes();
            fout.write(b);
            fout.close();

            FileInputStream fin = new FileInputStream("filecreation.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);

            }
            fin.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
