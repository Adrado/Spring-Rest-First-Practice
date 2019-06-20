package com.crazyclass.testrest.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.crazyclass.testrest.Models.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController
{
    private static List<User> UsersRepository;
    public UsersController()
    {
        if (UsersRepository == null)
        {
            UsersRepository = new ArrayList<User>();

            User user1 = new User();
            user1.setId(UUID.randomUUID());
            user1.setName("Pepe");
            user1.setFirstSurname("Gotera");
            user1.setSecondSurname("Yotilio");
            user1.setEmail("a@a");
            user1.setPassword("1234");

            User user2 = new User();
            user2.setId(UUID.randomUUID());
            user2.setName("Lolo");
            user2.setFirstSurname("Miau");
            user2.setSecondSurname("Loe");
            user2.setEmail("l@a");
            user2.setPassword("4567");

            UsersRepository.add(user1);
            UsersRepository.add(user2);
        }
    }

    @GetMapping("/api/users")
    @ResponseBody
    public List<User> Get()
    {
        return UsersRepository;
    }

    @PostMapping("/api/users")
    public User CreateUser(@RequestBody User input)
    {
        input.setId(UUID.randomUUID());
        UsersRepository.add(input);
        return input;
    }
}

