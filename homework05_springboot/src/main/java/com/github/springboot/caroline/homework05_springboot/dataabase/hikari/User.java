package com.github.springboot.caroline.homework05_springboot.dataabase.hikari;

/**
 * @ClassName User
 * @Description TODO
 * @Author Caroline
 * @Date 2022/4/4 15:01
 **/
public class User {
    private Long id;
    private String name;
    private String password;
    private String phoneNumber;
    private Long money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}
