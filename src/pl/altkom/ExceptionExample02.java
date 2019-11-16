package pl.altkom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample02 {
    public static void main(String[] args)  {
        try {
            FileInputStream fis
                    = new FileInputStream("/home/student/.bash_history");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("I tak się wykonam :)");
        }
    }
}
