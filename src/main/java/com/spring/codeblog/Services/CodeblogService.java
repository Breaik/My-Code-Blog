package com.spring.codeblog.Services;

import com.spring.codeblog.Model.Post;

import java.util.List;

public interface CodeblogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
