package com.mypack.user.controller;

import com.mypack.user.VO.ResponseTempVO;
import com.mypack.user.domain.User;
import com.mypack.user.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTempVO getUser(@PathVariable Long id){
        log.info("Inside getUser of UserController");
        return userService.getUser(id);
    }

}
