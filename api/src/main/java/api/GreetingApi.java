package api;
import core.GreetingService;
public class GreetingApi {
    private final GreetingService service = new GreetingService();
    public String buildMessage(String name) {
        return "[API] " + service.greet(name);
    }
}