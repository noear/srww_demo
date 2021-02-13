package controller;

import demo.HelloService;
import org.noear.nami.annotation.NamiClient;
import org.noear.solon.annotation.Component;

/**
 * @author noear 2021/2/12 created
 */
@Component
public class HelloTest {
    @NamiClient(upstream = "http://localhost:8081")
    HelloService helloService;

    public void test() {
        System.out.println(helloService.hello("noear"));
    }
}
