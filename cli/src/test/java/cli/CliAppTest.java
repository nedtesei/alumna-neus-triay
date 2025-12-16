package cli;
import org.junit.jupiter.api.Test;
class CliAppTest {
    @Test
    void main_noLanzaExcepciones() {
        CliApp.main(new String[]{});
    }
}