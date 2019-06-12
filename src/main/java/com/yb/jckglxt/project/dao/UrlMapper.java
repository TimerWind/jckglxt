package com.yb.jckglxt.project.dao;

import com.yb.jckglxt.project.domain.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019-06-12.
 */
@Mapper
public interface UrlMapper {

    List<Menu> menuList();

}
