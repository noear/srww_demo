package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.noear.snack.ONode;
import org.noear.solon.test.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

/**
 * @author noear 2021/2/11 created
 */
@RunWith(SolonJUnit4ClassRunner.class)
@SolonTest(App.class)
public class ApiForWebTest extends HttpTestBase {
    public ONode call(String method, Map<String, Object> args) throws Exception {
        ONode node = new ONode();
        node.set("method", method);
        node.get("data").setAll(args);

        String json0 = node.toJson();
        String json_b640 = Base64.getEncoder().encodeToString(json0.getBytes(StandardCharsets.UTF_8));

        String josn_b64 = path("/api/v1/web/")
                .header("JWT", "noear")
                .bodyTxt(json_b640)
                .post();

        String json = new String(Base64.getDecoder().decode(josn_b64));

        return ONode.loadStr(json);
    }

    @Test
    public void config_get() throws Exception {
        ONode node = call("config.get", new KvMap().set("tag", "water"));

        assert node.get("code").getInt() == 200;
        assert node.get("data").count() > 1;
    }
}
