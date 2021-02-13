package demo.controller;

import demo.controller.trigger.EndHandler;
import demo.controller.trigger.OutputHandler;
import demo.controller.trigger.StartHandler;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;

/**
 * @author noear 2021/2/10 created
 */
@Mapping("/api/v1/app/**")
@Controller
public class ApiGatewayForApp extends ApiGateway {
    @Override
    protected void register() {
        before(StartHandler.class);

        after(OutputHandler.class);
        after(EndHandler.class);

        super.register();
    }
}
