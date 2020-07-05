import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class HelloWorld {
    @Parameter(names = {"--name", "-n"}, required = false)
    String name;

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        JCommander.newBuilder()
                .addObject(hw)
                .build()
                .parse(args);
        System.out.println(hw.message());
    }

    public String message() {
        if(name != null) {
            return String.format("Hello %s!", name);
        }
        else {
            return "Hello World!";
        }
    }
}
