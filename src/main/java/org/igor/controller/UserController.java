package org.igor.controller;

import org.igor.domain.User;
import org.igor.repository.UserRepository;
import org.igor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * Created by igorhara on 02/06/2018.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    UserService service;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping
    public List<User> getUser(@RequestParam(value = "id", required = false) Long id, @RequestParam(value = "name",
            required = false) String name, @RequestParam(value = "role",
            required = false) String role) {
        User user= null;

        if(id!=null||name!=null || role !=null){
            user = new User();
            user.setId(id);
            user.setName(name);
            user.setRole(role);
        }

        return service.getUsersByExample(user);
    }
}
