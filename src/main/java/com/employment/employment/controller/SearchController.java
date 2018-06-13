package com.employment.employment.controller;

import com.employment.employment.business.impl.SearchBusinessImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jianghui
 * @date 2018/6/11 下午8:44
 */

@Controller
public class SearchController {
    @Autowired
    private SearchBusinessImpl searchBusinessImpl;

    @GetMapping("/search")
    public String search(@RequestParam(name = "searchContent") String searchContent, Model model){

        model.addAttribute("jobs",searchBusinessImpl.searchJobInfo(searchContent));

        return "search";

//        return searchBusinessImpl.searchJobInfo(searchContent);
    }
}
