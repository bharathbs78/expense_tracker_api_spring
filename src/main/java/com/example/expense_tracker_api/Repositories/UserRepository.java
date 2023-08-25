package com.example.expense_tracker_api.Repositories;

import com.example.expense_tracker_api.Domain.User;
import com.example.expense_tracker_api.Exceptions.EtAuthException;

public class UserRepository implements IUserRepository{

    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User getById(Integer userId) {
        return null;
    }
}
