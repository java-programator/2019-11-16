package pl.altkom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis
                    = new FileInputStream("/home/studen/.bash_history");
            fis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
