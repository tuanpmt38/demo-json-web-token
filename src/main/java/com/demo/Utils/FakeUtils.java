package com.demo.Utils;

import com.demo.models.News;

import java.util.ArrayList;
import java.util.List;

public class FakeUtils {
    public static List<News> getAllNews() {
        List<News> newsList = new ArrayList<News>();
        newsList.add(new News("Title 1", "Demo - From asian to the world", "Cong Phuong"));
        newsList.add(new News("Title 2", "Demo - We make it awesome", "Cong Phuong"));
        newsList.add(new News("Title 3", "Demo - 2012 to 2017", "Cong Phuong"));
        return newsList;
    }
}
