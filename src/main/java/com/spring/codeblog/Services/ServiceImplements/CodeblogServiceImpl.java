package com.spring.codeblog.Services.ServiceImplements;

import com.spring.codeblog.Model.Post;
import com.spring.codeblog.Repositoy.CodeBlogRepository;
import com.spring.codeblog.Services.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }
}
