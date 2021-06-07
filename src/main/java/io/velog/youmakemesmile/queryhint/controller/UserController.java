package io.velog.youmakemesmile.queryhint.controller;

import io.velog.youmakemesmile.queryhint.entity.User;
import io.velog.youmakemesmile.queryhint.jpa.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/{id}")
    public User retrieveByName(@PathVariable String id){
        return userRepository.findById(id).get();
    }

    @GetMapping
    public List<User> retrieveAll(){
        return userRepository.findAll();
    }

    @PostMapping
    public void register(@RequestBody User user){
        userRepository.save(user);
    }



}
