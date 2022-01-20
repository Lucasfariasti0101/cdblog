package com.spring.cdblog.service;

import com.spring.cdblog.entities.Post;

import java.util.List;

public interface CdblogService {
    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
