package demo.controller.apis;

import demo.controller.ApiCodes;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;

/**
 * 默认接口
 * @author noear 2021/2/10 created
 */
@Component(tag = "api")
public class API_0 {
    @Mapping
    public void exec() {
        throw ApiCodes.CODE_4001001;
    }
}
