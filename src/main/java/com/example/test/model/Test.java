package com.example.test.model;

import javax.persistence.*;
@Entity
@Table(name = "data")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer number;

    @Column
    private String hello = "Hello World!";

    @Column
    private String login = "Number of logins:";

    public Test(Long id, Integer number, String hello, String login) {
        this.id = id;
        this.number = number;
        this.hello = hello;
        this.login = login;
    }

    public Test() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
