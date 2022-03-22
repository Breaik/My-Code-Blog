package com.spring.codeblog.Repositoy;

import com.spring.codeblog.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
