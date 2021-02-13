package demo.controller;

import demo.dso.service.HelloService;
import demo.dso.service.UserService;
import demo.model.UserModel;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.ModelAndView;

/**
 * @author noear 2021/2/8 created
 */
@Controller
public class JsonController {
    @Inject
    UserService userService;

    @Mapping("/json")
    public UserModel view_json() {
        return userService.getUser();
    }
}
