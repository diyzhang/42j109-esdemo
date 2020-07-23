package cn.toj.esdemo.service;

import cn.toj.esdemo.domain.User;

import java.util.List;

public interface IUserService {

    /**
     * 保存用户
     * @param user
     * @return
     */
    User save(User user);

    /**
     * 删除用户
     * @param user
     */
    void del(User user);

    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
    List<User> getByName(String name);

}
