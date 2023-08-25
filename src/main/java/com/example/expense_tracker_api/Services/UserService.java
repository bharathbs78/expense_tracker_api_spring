package com.example.expense_tracker_api.Services;

import com.example.expense_tracker_api.Domain.User;
import com.example.expense_tracker_api.Exceptions.EtAuthException;
import com.example.expense_tracker_api.Repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;
    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        Pattern pat= Pattern.compile("^(.+)@(.+)$");
        email=email!=null?email.toLowerCase():null;
        if(!pat.matcher(email).matches())
            throw new EtAuthException("Not a valid email");
        Integer emailAlreadyInUse=userRepository.getCountByEmail(email);
        if(emailAlreadyInUse>0)
            throw new EtAuthException("User already present");
        Integer userId=userRepository.create(firstName,lastName,email,password);
        return userRepository.getById(userId);
    }
}
