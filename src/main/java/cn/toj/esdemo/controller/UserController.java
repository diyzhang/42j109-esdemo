package cn.toj.esdemo.controller;

import cn.toj.esdemo.domain.User;
import cn.toj.esdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/23
 */

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/insert")
    public User insert(@RequestBody User user){

        User saveUser = userService.save(user);

        return saveUser;

    }

    @PostMapping("/del")
    public String delete(@RequestBody User user){

        userService.del(user);

        return "Delete user success.";

    }

    @PostMapping("/query")
    public List<User> getByName(@RequestBody String name) {

        return userService.getByName(name);

    }

}
