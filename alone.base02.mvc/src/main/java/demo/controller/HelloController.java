package demo.controller;

import demo.dso.service.HelloService;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;

/**
 * @author noear 2021/2/8 created
 */
@Controller
public class HelloController {

    @Inject
    HelloService helloService;

    @Mapping("/hello")
    public String hello() {
        return helloService.hello("world");
    }
}
