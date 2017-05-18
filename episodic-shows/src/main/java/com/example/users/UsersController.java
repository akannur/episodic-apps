package com.example.users;

import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    private final UserRepository userRepo;

    public UsersController(UserRepository userRepo) {
        Assert.notNull(userRepo, "Repo has to be present!");
        this.userRepo = userRepo;

    }

    @PostMapping("")
    public User createUser(@RequestBody User user)
    {
        System.out.println(user.toString());
        return this.userRepo.save(user);

    }
}
