package com.hysea.blog.controller;

import com.hysea.blog.entity.Blog;
import com.hysea.blog.service.BlogService;
import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "登录模块")
@RequestMapping(value = "/blog")
public class BlogController {

    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    /**获取所有博客**/
    @RequestMapping(value = "/getAllBlog",method = RequestMethod.GET)
    @ResponseBody
    public String getAllBlog(){
        Blog blogById = blogService.getBlogById(1);
        return blogById.toString();
    }
}
