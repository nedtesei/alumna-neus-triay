package api;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GreetingApiTest {
    @Test
    void buildMessage_empiezaPorEtiquetaApi() {
        GreetingApi api = new GreetingApi();
        String msg = api.buildMessage("Jose");
        assertTrue(msg.startsWith("[API] "));
    }
}