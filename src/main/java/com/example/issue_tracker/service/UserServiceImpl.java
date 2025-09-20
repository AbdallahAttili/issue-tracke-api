package com.example.issue_tracker.service;

import com.example.issue_tracker.dao.UserDAO;
import com.example.issue_tracker.dto.CreateUserRequest;
import com.example.issue_tracker.dto.UserResponse;
import com.example.issue_tracker.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserDAO userDAO, ModelMapper modelMapper) {
        this.userDAO = userDAO;
        this.modelMapper = modelMapper;
    }

    public UserResponse createUser(CreateUserRequest userRequest){
        User user = modelMapper.map(userRequest, User.class);
        return modelMapper.map(userDAO.save(user), UserResponse.class);
    }

    public List<UserResponse> getAll(){
        return userDAO.findAll().stream()
                .map(user -> modelMapper.map(user, UserResponse.class))
                .toList();
    }

    public UserResponse findByUsername(String username) {
        User user = userDAO.findByUsername(username);
        if (user == null) {
            return null;
        }
        return modelMapper.map(user, UserResponse.class);
    }

    public UserResponse findByEmail(String email) {
        User user = userDAO.findByEmail(email);
        if (user == null) {
            return null;
        }
        return modelMapper.map(user, UserResponse.class);
    }
}
