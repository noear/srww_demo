package demo.widget;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import org.noear.solon.annotation.Component;

import java.io.IOException;
import java.util.Map;


/**
 * 自定义视图组件
 * */
@Component("view:footer")
public class FooterTag implements TemplateDirectiveModel {
    @Override
    public void execute(Environment env, Map map, TemplateModel[] templateModels, TemplateDirectiveBody body) throws TemplateException, IOException {
        StringBuilder buf = new StringBuilder();

        buf.append("<footer>");
        buf.append("<p>I'm footer（我是自定义视图组件）</p>");
        buf.append("</footer>");

        env.getOut().write(buf.toString());
    }
}
