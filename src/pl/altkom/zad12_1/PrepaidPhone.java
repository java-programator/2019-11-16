package pl.altkom.zad12_1;

public class PrepaidPhone {
    int minutesLimit = 10;

    public void makeCall(int callDurationInMinutes) throws PrepaidPhoneException {
        if (callDurationInMinutes > minutesLimit) {
            throw new PrepaidPhoneException("Nie masz limitu");
        } else {
            minutesLimit-=callDurationInMinutes;
            System.out.println("Nice talk");
        }
    }
}