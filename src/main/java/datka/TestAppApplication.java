package datka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAppApplication.class, args);
        System.out.println("Project is running...");
    }
    @GetMapping("/api/test/hello")
    public String hello(@RequestParam(required = false, defaultValue = "Datka") String name) {
        return "Hello, " + name + "!!!";
    }


}
