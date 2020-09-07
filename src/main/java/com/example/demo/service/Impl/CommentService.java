package com.example.demo.service.Impl;

import com.example.demo.model.Comment;
import com.example.demo.service.ICommentService;

import java.util.List;
import java.util.Optional;

public class CommentService implements ICommentService {
    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public Optional<Comment> findById() {
        return Optional.empty();
    }

    @Override
    public Optional<Comment> findByName() {
        return Optional.empty();
    }

    @Override
    public boolean save(Comment comment) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public boolean deleteByObject(Comment comment) {
        return false;
    }

    @Override
    public boolean updateById(int id) {
        return false;
    }

    @Override
    public boolean updateByObject(Comment comment) {
        return false;
    }
}
