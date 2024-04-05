package datka.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/api/test/hello")
    public String hello(@RequestParam(name = "name") String name) {
        return "Hello, " + name + "!!!";
    }
}