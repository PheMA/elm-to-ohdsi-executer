package edu.phema.elm_to_omop;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhemaTestHelper {
    public static String getFileAsString(String filePath) throws IOException {
        URL url = PhemaTestHelper.class.getClassLoader().getResource(filePath);

        File file = new File(url.getPath());
        StringBuilder fileContents = new StringBuilder((int) file.length());

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine() + System.lineSeparator());
            }
            return fileContents.toString();
        }
    }

    public static void assertStringsEqualIgnoreWhitespace(String lhs, String rhs) {
        String left = lhs.replaceAll("\\s+", "");
        String right = rhs.replaceAll("\\s+", "");

        assertEquals(left, right);
    }
}