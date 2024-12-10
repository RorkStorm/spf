package be.nsi.spf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EncrypterTest {

    @Test
    public void testGenerateSHA1Failed() {
        String input = "Hello, World!";
        String expectedHash = "2ef7bde608ce5404e97d5f042f95f89f1c232871"; // Hash SHA-1 attendu pour "Hello, World!"

        String actualHash = Encrypter.generateSHA1(input);

        assertNotEquals(expectedHash, actualHash, "The SHA-1 hash should match the expected value");
    }

    @Test
    public void testGenerateSHA1Succeed() {
        String input = "Hello, World!";
        String expectedHash = "0a0a9f2a6772942557ab5355d76af442f8f65e01"; // Hash SHA-1 attendu pour "Hello, World!"

        String actualHash = Encrypter.generateSHA1(input);

        assertEquals(expectedHash, actualHash, "The SHA-1 hash should match the expected value");
    }


}

