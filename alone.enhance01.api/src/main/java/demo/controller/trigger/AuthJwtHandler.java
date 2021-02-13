package demo.controller.trigger;

import demo.controller.ApiCodes;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Handler;

/**
 * @author noear 2021/2/11 created
 */
public class AuthJwtHandler implements Handler {
    @Override
    public void handle(Context c) throws Throwable {
        if (c.header("JWT") == null) {
            throw ApiCodes.CODE_4002002;
        }
    }
}
