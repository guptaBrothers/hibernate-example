package rk.hibernate.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rk.hibernate.example.entity.User;
import rk.hibernate.example.repository.UserRepository;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public List<User> saveUsers(List<User> users){

       return  userRepository.saveAll(users);
    }

}
