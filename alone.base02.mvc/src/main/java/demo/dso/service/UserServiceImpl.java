package demo.dso.service;

import demo.model.UserModel;
import org.noear.solon.annotation.Inject;
import org.noear.solon.extend.aspect.annotation.Service;

/**
 * @author noear 2021/2/9 created
 */
@Service
public class UserServiceImpl implements UserService{
    @Inject
    HelloService helloService;

    public UserModel getUser(){
        UserModel user = new UserModel();

        user.level = 12;
        user.mail = "noear@live.cn";
        user.name = "noear";
        user.mobile = "18611112222";
        user.message = helloService.hello("noear");

        return user;
    }
}
