package demo.dso.service;

import org.noear.solon.extend.aspect.annotation.Service;

/**
 * @author noear 2021/2/8 created
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
