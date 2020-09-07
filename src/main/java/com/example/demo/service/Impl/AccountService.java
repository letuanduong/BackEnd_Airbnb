package com.example.demo.service.Impl;

import com.example.demo.model.Account;
import com.example.demo.service.IAccountService;

import java.util.List;
import java.util.Optional;

public class AccountService implements IAccountService {
    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Optional<Account> findById() {
        return Optional.empty();
    }

    @Override
    public Optional<Account> findByName() {
        return Optional.empty();
    }

    @Override
    public boolean save(Account account) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public boolean deleteByObject(Account account) {
        return false;
    }

    @Override
    public boolean updateById(int id) {
        return false;
    }

    @Override
    public boolean updateByObject(Account account) {
        return false;
    }
}
