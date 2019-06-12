package com.yb.jckglxt.project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-06-12.
 */
public interface TestDao {
//    @Select("select * from menu")
    List<Map> test();

}
