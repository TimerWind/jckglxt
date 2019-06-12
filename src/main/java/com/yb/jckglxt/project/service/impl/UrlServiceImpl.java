package com.yb.jckglxt.project.service.impl;

import com.yb.jckglxt.project.dao.UrlMapper;
import com.yb.jckglxt.project.domain.Menu;
import com.yb.jckglxt.project.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019-06-12.
 */
@Service
public class UrlServiceImpl implements UrlService {

    @Autowired
    UrlMapper urlMapper;

    @Override
    public List<Menu> getMenuList() {
        return urlMapper.menuList();
    }
}
