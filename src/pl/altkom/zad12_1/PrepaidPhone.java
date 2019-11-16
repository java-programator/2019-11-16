package pl.altkom.zad12_1;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class PrepaidPhone {
    private int limit;

    public PrepaidPhone(int limit) {
        this.limit = limit;
    }

    /**
     *
     * @param duration
     * @throws PrepaidPhoneException
     * @throws IOException
     * @throws NoSuchFileException
     */
    public void makeCall(int duration)
            throws PrepaidPhoneException,
            IOException, NoSuchFileException {
        if (duration > limit) {
            throw new PrepaidPhoneException("Za długo gadasz");
        }
        limit -= duration;
        System.out.println("Nice talk");
    }
}
