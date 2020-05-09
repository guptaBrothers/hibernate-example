package rk.hibernate.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rk.hibernate.example.entity.User;
import rk.hibernate.example.service.UserService;

@RestController
@RequestMapping("/user-service")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<List<User>> saveUsers(@RequestBody List<User> users){
        List<User> createdUserList = userService.saveUsers(users);
        return new ResponseEntity<>(createdUserList , HttpStatus.OK);
    }

    @GetMapping("/test")
    public String testService(){
        return "Hello World -Service us up";
    }
}
