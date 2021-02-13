import controller.HelloTest;
import org.noear.solon.Solon;
import org.noear.solon.core.Aop;

/**
 * @author noear 2021/2/12 created
 */
public class RpcConsumerApp {
    public static void main(String[] args) {
        Solon.start(RpcConsumerApp.class, args);

        HelloTest helloTest = Aop.get(HelloTest.class);
        helloTest.test();
    }
}
