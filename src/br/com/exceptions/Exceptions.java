package src.br.com.exceptions;

// NOTE - Checked exceptions
// NOTE - Unchecked exceptions

public class Exceptions {
    public static void main(String[] args) throws Exception {
        try {
            Exceptions.validateNumber();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void validateNumber() throws Exception {
        int value = 10;

        if (value < 100) {
            throw new Exception("The number is less than 100");
        }
    }
}
