package com.chudik0.service;

import com.chudik0.dao.PostDao;
import com.chudik0.model.Post;

import java.util.List;

public class PostService {
    private PostDao postDao;

    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

    public Integer createPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return postDao.save(post);
    }

    public List<Post> getAllPosts() {
        return postDao.findAll();
    }

    public Post getPostById(Integer id) {
        return postDao.findById(id);
    }

    public void deletePost(Integer id) {
        postDao.delete(id);
    }

    public void updatePost(Integer id, String title, String content) {
        Post post = new Post();
        post.setId(id);
        post.setTitle(title);
        post.setContent(content);
        postDao.update(post);
    }
}
