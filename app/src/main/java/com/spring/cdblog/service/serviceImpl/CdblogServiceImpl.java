package com.spring.cdblog.service.serviceImpl;

import com.spring.cdblog.entities.Post;
import com.spring.cdblog.repository.PostRepository;
import com.spring.cdblog.service.CdblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CdblogServiceImpl implements CdblogService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
