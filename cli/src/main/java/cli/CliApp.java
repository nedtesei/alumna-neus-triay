package cli;
import api.GreetingApi;
public class CliApp {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "";
        GreetingApi api = new GreetingApi();
        String message = api.buildMessage(name);
        System.out.println(message);
    }
}