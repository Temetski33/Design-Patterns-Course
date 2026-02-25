package decorator;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator{

    private static final String KEY = "HIENOTESTKEY2345"; // 16 chars

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }
    @Override
    public void print(String message) {
        try {
            String encrypted = encrypt(message);
            super.print(encrypted);
            // Making sure the message is decryptable
            System.out.println("\n" + "Test decrypt function straight to system print: ");
            String decrypted = decrypt(encrypted);
            System.out.println(decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String encrypt(String message) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encrypted = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public String decrypt(String encrypted) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] decoded = Base64.getDecoder().decode(encrypted);
        return new String(cipher.doFinal(decoded));
    }
}
