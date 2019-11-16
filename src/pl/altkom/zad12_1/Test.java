package pl.altkom.zad12_1;

import javafx.css.CssParser;

public class Test {
    public static void main(String[] args) {
        var phone = new PrepaidPhone();
        try{
            phone.makeCall(6);
            phone.makeCall(6);
        }catch (PrepaidPhoneException e){
            System.out.println(e);
        }

    }
}
