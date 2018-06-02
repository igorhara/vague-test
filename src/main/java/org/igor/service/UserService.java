package org.igor.service;

import org.igor.domain.User;
import org.igor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by igorhara on 02/06/2018.
 */
@Service
@Transactional
public class UserService {

    UserRepository repository;

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }


    public User createUser(@Validated User user){
        return repository.save(user);
    }

    public List<User> getUsersByExample(User user){

        if(user!=null){
            Example<User> of = Example.of(user);
            return repository.findAll(of);
        }

        return repository.findAll();

    }
}
