package cn.toj.esdemo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/23
 */

// Document中的indexName必须为小写英文，否则会报错，相当于表名
@Document(indexName = "user")
public class User implements Serializable {

    @Id
    private String userId;
    private String userName;
    private String sex;
    private String address;

    public User(String userId, String userName, String sex, String address) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.address = address;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
