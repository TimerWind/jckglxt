package com.yb.jckglxt.project.service.impl;

import com.yb.jckglxt.project.dao.TestDao;
import com.yb.jckglxt.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-06-12.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired

    TestDao testDao;


    @Override
    public List<Map> test() {
        return testDao.test();
    }
}
