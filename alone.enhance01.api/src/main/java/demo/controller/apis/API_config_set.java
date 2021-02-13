package demo.controller.apis;

import demo.controller.ApiBase;
import demo.dso.mapper.ConfigMapper;
import demo.model.db.WaterCfgPropertiesDo;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.extend.validation.annotation.NotEmpty;
import org.noear.weed.annotation.Db;

/**
 * @author noear 2021/2/11 created
 */
@Component(tag = "api")
public class API_config_set extends ApiBase {

    @Db
    ConfigMapper configMapper;

    @NotEmpty({"tag", "key"})
    @Mapping("config.set")
    public void exec(String tag, String key, String value) throws Throwable {
        //1.查找配置
        WaterCfgPropertiesDo cfg = configMapper.getConfig(tag, key);

        if (cfg.row_id == 0) {
            //2.如果没有，新增配置
            configMapper.addConfig(tag, key, value);
        } else {
            if (cfg.is_editable == false) {
                return;
            }

            //3.如果可以修改，则修改值
            configMapper.udpConfig(tag, key, value);
        }
    }
}
