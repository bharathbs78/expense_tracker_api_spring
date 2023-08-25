package com.example.expense_tracker_api.Services;

import com.example.expense_tracker_api.Exceptions.EtAuthException;
import com.example.expense_tracker_api.Domain.User;

public interface IUserService {
    User validateUser(String email, String password) throws EtAuthException;
    User registerUser(String firstName,String lastName,String email,String password) throws EtAuthException;

}
