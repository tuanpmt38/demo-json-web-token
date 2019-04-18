package com.demo.controllers;

import com.demo.Utils.FakeUtils;
import com.demo.models.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/news")
public class NewsController {
    @RequestMapping(method = RequestMethod.GET)


    public List<News> news(HttpServletRequest request) {
        return FakeUtils.getAllNews();
    }
}
