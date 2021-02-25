package demo;

import org.noear.mlog.Logger;
import org.noear.mlog.LoggerFactory;
import org.noear.mlog.utils.Tags;
import org.noear.solon.Solon;
import org.noear.solon.core.handle.Context;

/**
 * @author noear 2021/2/10 created
 */
public class App {
    static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {


        Solon.start(App.class, args).onError(err -> {
            Context ctx = Context.current();

            if (ctx == null) {
                logger.error(err);
            } else {
                logger.error(Tags.tag0(ctx.path()), err);
            }
        });
    }
}
