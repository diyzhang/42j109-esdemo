package cn.toj.esdemo.service.impl;

import cn.toj.esdemo.dao.UserRepository;
import cn.toj.esdemo.domain.User;
import cn.toj.esdemo.service.IUserService;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/23
 */

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void del(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> getByName(String name) {
        List<User> userList = new ArrayList<>();
        MatchQueryBuilder queryBuilder = new MatchQueryBuilder("userName", name);
        Iterable<User> userIterable = userRepository.search(queryBuilder);
        userIterable.forEach(userList::add);
        return userList;
    }
}
