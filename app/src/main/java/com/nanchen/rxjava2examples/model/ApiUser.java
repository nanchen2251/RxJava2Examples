package com.nanchen.rxjava2examples.model;

/**
 * Author: nanchen
 * Email: liushilin520@foxmail.com
 * Date: 2017-06-30  14:25
 */

public class ApiUser {
    public long id;
    public String firstname;
    public String lastname;

    @Override
    public String toString() {
        return "ApiUser{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
