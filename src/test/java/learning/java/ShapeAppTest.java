package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ShapeAppTest {
    @Test
    void testMainOutput() {
        // Перехоплюємо вивід програми
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ShapeApp.main(null); // Запускаємо програму

        String output = outputStream.toString();
        assertTrue(output.contains("Прямокутник"), "Вивід не містить даних про прямокутник!");
        assertTrue(output.contains("Коло"), "Вивід не містить даних про коло!");
    }

}