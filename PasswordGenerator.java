import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        Random random = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String password = "";

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            password = password + characters.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}