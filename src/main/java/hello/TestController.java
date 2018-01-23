package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by vsossella on 22/05/17.
 */

@RestController
public class TestController {

//    @RequestMapping("/test")
//    public String test() {
//        return "Hello";
//    }

    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";


    @RequestMapping("/greeting")
    public Uepa greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Uepa(counter.incrementAndGet(),
                String.format(template, name));
    }


}
