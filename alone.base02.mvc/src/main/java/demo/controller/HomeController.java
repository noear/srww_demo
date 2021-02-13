package demo.controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Context;


/**
 * @author noear 2021/2/10 created
 */
@Controller
public class HomeController {
    @Mapping("/")
    public void home(Context ctx) {
        ctx.redirect("/debug.htm");
    }
}
