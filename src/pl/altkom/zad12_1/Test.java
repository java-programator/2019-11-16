package pl.altkom.zad12_1;

public class Test {
    public static void main(String[] args) {
        PrepaidPhone phone = new PrepaidPhone(100);

        try {
            phone.makeCall(99);
            phone.makeCall(10);
        } catch (PrepaidPhoneException e) {
            e.printStackTrace();
        }
    }
}
