package demo.controller;

import org.noear.snack.ONode;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.Gateway;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author noear 2021/2/10 created
 */
public abstract class ApiGateway extends Gateway {
    @Override
    protected void register() {
        addBeans(bw -> "api".equals(bw.tag()));
    }

    @Override
    public void render(Object obj, Context c) throws Throwable {
        if (c.getRendered()) {
            return;
        } else {
            c.setRendered(true);
        }

        Map<String, Object> rst = new LinkedHashMap<>();

        if (obj instanceof ApiCode) {
            ApiCode code = (ApiCode) obj;
            rst.put("code", code.code);
            rst.put("description", code.message);
        } else if (obj instanceof Throwable) {
            rst.put("code", ApiCodes.CODE_4009999.code);
            rst.put("description", ApiCodes.CODE_4009999.message);
        } else {
            rst.put("code", ApiCodes.CODE_200.code);
            rst.put("description", ApiCodes.CODE_200.message);
            rst.put("data", obj);
        }

        //只构建结果，不输出（根据网关需要，输出时再做控制）
        c.result = ONode.stringify(rst);
    }
}
