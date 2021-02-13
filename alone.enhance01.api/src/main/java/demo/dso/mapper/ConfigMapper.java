package demo.dso.mapper;

import java.math.*;
import java.sql.SQLException;
import java.time.*;
import java.util.*;

import org.noear.weed.BaseMapper;
import org.noear.weed.DataItem;
import org.noear.weed.DataList;
import org.noear.weed.annotation.Db;
import org.noear.weed.xml.Namespace;
import demo.model.db.*;

@Namespace("demo.dso.mapper.ConfigMapper")
public interface ConfigMapper{
    //获取配置列表
    List<WaterCfgPropertiesDo> getConfigsByTag(String tag) throws SQLException;

    //获取配置
    WaterCfgPropertiesDo getConfig(String tag, String key) throws SQLException;

    //设置配置
    long addConfig(String tag, String key, String value) throws SQLException;

    //设置配置
    long udpConfig(String tag, String key, String value) throws SQLException;
}
