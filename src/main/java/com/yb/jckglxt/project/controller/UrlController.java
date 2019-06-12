package com.yb.jckglxt.project.controller;

import com.yb.jckglxt.project.domain.Menu;
import com.yb.jckglxt.project.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019-06-12.
 */
@RestController
public class UrlController {

    @Autowired
    UrlService urlService;

    @GetMapping("/getMenuList")
    public List<Menu> getUrl(){
        return urlService.getMenuList();
    }


}
