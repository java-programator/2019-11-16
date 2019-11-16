package pl.altkom.zad12_1;

public class PrepaidPhoneException extends Exception{
    PrepaidPhoneException(){}
    PrepaidPhoneException(String s){
        new Exception(s);
    }
}
