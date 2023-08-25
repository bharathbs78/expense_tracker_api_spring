package com.example.expense_tracker_api.Repositories;

import com.example.expense_tracker_api.Domain.User;
import com.example.expense_tracker_api.Exceptions.EtAuthException;

public interface IUserRepository {
    Integer create(String firstName,String lastName,String email,String password) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws EtAuthException;
    Integer getCountByEmail(String email);
    User getById(Integer userId);
}
