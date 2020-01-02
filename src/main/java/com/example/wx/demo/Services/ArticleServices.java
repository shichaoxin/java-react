package com.example.wx.demo.Services;

import com.example.wx.demo.Entity.ArticleEntity;
import com.example.wx.demo.Models.ArticleInfo;
import com.example.wx.demo.Utils.PageBean;
import org.springframework.stereotype.Service;

@Service
public interface ArticleServices {
    // 保存发布的文章
    ArticleEntity saveArticleMessage(ArticleInfo articleInfo);

    // 删除自己的文章
    Boolean deleteArticleOfOwn(String id, String personId);

    // 分页展示文章
    PageBean getArticleByPageAndSize(int page, int size);
}
