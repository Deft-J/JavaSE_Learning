package com.coder.user;

import java.io.Serial;
import java.io.Serializable;

public class Users implements Serializable {
    @Serial
    private static final long serialVersionUID = -2723422908271075897L;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
