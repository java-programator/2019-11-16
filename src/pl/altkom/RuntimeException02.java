package pl.altkom;

import java.util.ArrayList;
import java.util.List;

public class RuntimeException02 {
    public static void main(String[] args) {
//        System.out.println(1/0);
        List<String> strings = new ArrayList<>();
        strings.get(1);
    }
}
