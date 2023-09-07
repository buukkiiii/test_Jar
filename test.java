import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestApiExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiExampleApplication.class, args);
    }
}

@RestController
class TextController {

    @GetMapping("/text1")
    public String getText1() {
        return "This is text 1.";
    }

    @GetMapping("/text2")
    public String getText2() {
        return "Here is text 2.";
    }

    @GetMapping("/text3")
    public String getText3() {
        return "Welcome to text 3.";
    }

    @GetMapping("/text4")
    public String getText4() {
        return "Text 4 is here.";
    }
}

