package com.hysea.blog.service.impl;

import com.hysea.blog.entity.Blog;
import com.hysea.blog.mapper.BlogMapper;
import com.hysea.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public Blog getBlogById(Integer userId) {
        Blog blog = blogMapper.selectById(userId);
        return blog;
    }
}