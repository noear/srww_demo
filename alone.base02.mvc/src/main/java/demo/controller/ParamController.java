package demo.controller;

import demo.dso.service.HelloService;
import demo.model.UserModel;
import org.noear.solon.Utils;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.Context;
import org.noear.solon.core.handle.MethodType;
import org.noear.solon.core.handle.UploadedFile;

import java.io.File;

/**
 * @author noear 2021/2/8 created
 */
@Controller
public class ParamController {
    @Inject
    HelloService helloService;

    /**
     * 通过注入，获取Form 和 QueryString 的参数
     *
     * @param ctx 上下文，可以随意注入
     */
    @Mapping("/param/post")
    public String param_post(Context ctx, String name, int gender) {
        return helloService.hello(name);
    }

    /**
     * 通过注入，获取Post上传的文件和其它参数
     */
    @Mapping(value = "/param/file", method = MethodType.POST)
    public String param_file(String name, UploadedFile file) {
        if (file != null) {
            return Utils.getString(file.content, "utf-8");
        } else {
            return helloService.hello(name);
        }
    }

    /**
     * 通过注入，获取路由里的变量
     */
    @Mapping("/param/path/{name}")
    public String param_path(String name) {
        return helloService.hello(name);
    }

    /**
     * 通过注入，使用UserModel收集所有Form 和 QueryString 的参数
     */
    @Mapping("/param/model")
    public UserModel param_model(UserModel user) {
        return user;
    }

    /**
     * 通过返回，提供文件下载功能
     */
    @Mapping(value = "/param/down", method = MethodType.GET)
    public File param_down(String name) throws Exception {
        //找到文件，并下载
        //
        String uri = Utils.getResource("static/debug.htm").getFile();

        return new File(uri);
    }
}