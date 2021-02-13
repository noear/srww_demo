package demo.controller.apis;

import cn.hutool.crypto.SecureUtil;
import demo.controller.ApiBase;
import demo.dso.mapper.RegisterMapper;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.extend.validation.annotation.NotEmpty;
import org.noear.weed.annotation.Db;

/**
 * @author noear 2021/2/12 created
 */
@Component(tag = "api")
public class API_service_unreg extends ApiBase {

    @Db
    RegisterMapper registerMapper;

    @NotEmpty({"service", "address"})
    @Mapping("service.unreg")
    public void exec(String service, String address) throws Throwable {

        String key = SecureUtil.md5(service + "#" + address);

        //1.删除注册的服务
        registerMapper.delService(key);
    }
}
