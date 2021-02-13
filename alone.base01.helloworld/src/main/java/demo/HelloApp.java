package demo;

import org.noear.solon.Solon;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;

/**
 * @author noear 2021/2/8 created
 */
@Controller
public class HelloApp {
    public static void main(String[] args) {
        Solon.start(HelloApp.class, args);
    }

    @Mapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
