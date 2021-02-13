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

@Namespace("demo.dso.mapper.RegisterMapper")
public interface RegisterMapper{
    //添加服务
    long addService(WaterRegServiceDo model) throws SQLException;

    //更新服务
    long udpService(WaterRegServiceDo model) throws SQLException;

    //删除服务
    long delService(String key) throws SQLException;

    //查找服务
    List<WaterRegServiceDo> getServiceList(String name) throws SQLException;
}
