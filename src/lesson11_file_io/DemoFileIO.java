package lesson11_file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIO {
    public static void main(String[] args) {
        String filename = "demo_file_io.dat";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename)
    {
        String s = "Hello Poly";
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(f);
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename)
    {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        try {
            FileInputStream fis = new FileInputStream(f);
            while (true) {
                int b = fis.read();
                if (b == -1) {
                    break;
                }
                
                System.out.print((char)b);
            }
            System.out.println("");
                    
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
