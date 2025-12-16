package core;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

@Test
void greet_conNombre_devuelveSaludoCorrecto() {
    GreetingService service = new GreetingService();
    String result = service.greet("Jose");
    assertEquals("Hola, Jose (desde core) ", result);
}

@Test
void greet_sinNombre_devuelveMensajePorDefecto() {
    GreetingService service = new GreetingService();
    String result = service.greet("");
    assertEquals("Hola desde core", result);
    }
}