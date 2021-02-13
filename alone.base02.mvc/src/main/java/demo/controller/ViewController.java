package demo.controller;

import demo.dso.service.HelloService;
import demo.model.UserModel;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.ModelAndView;

/**
 * @author noear 2021/2/8 created
 */
@Controller
public class ViewController {
    @Inject
    HelloService helloService;

    @Mapping("/view")
    public ModelAndView view_html() {
        String message = helloService.hello("world");

        ModelAndView mv = new ModelAndView("view.ftl");
        mv.put("message", message);
        return mv;
    }
}
