import org.example.Project;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectTest {
    private final Project c = new Project();
    @Test
    public void strong() {
        assertTrue(c.isStrongPassword("DEfer222"));//является сильным так как соответсвует критериям
        assertTrue(c.isStrongPassword("T2ge@w2"));//есть все  знакибЗагравные буквы
        assertTrue(c.isStrongPassword("Phqh36@"));
        assertTrue(c.isStrongPassword("P@sw0r"));
    }
    @Test
    public void notStrong() {
        assertFalse(c.isStrongPassword("sdsfвыds"), "false");// не сильный пароль так как нет знаков или цифр
        assertFalse(c.isStrongPassword("232414"), "false");
        assertFalse(c.isStrongPassword("HHHHHНH"), "false");
        assertFalse(c.isStrongPassword("1234356"), "false");
        assertFalse(c.isStrongPassword("passаwor"), "false");//так же обычный код не сильный

    }

}
